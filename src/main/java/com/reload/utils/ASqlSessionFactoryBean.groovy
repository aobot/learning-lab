package com.reload.utils

import org.apache.ibatis.builder.xml.XMLMapperBuilder
import org.apache.ibatis.session.Configuration
import org.apache.ibatis.session.SqlSessionFactory
import org.mybatis.spring.SqlSessionFactoryBean
import org.springframework.beans.factory.DisposableBean
import org.springframework.core.io.Resource

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class ASqlSessionFactoryBean extends SqlSessionFactoryBean implements DisposableBean {

    def refreshRunner = Executors.newScheduledThreadPool(1)
    volatile Configuration config
    Resource[] locations

    @Override
    public void setMapperLocations(Resource[] mapperLocations) {
        super.setMapperLocations(mapperLocations)
        this.locations = mapperLocations
    }


    private final def refresh() {

        AConfiguration configuration = new AConfiguration(config);
        try {
            Runnable xmlMapperReloader = new Runnable() {
                @Override
                void run() {
                    println "==   ${new Date()}  =="
                    try {
                        for (def ml in locations) {
                            XMLMapperBuilder xmlMapperBuilder = new XMLMapperBuilder(ml.getInputStream(),
                                    configuration, ml.toString(), configuration.getSqlFragments());
                            xmlMapperBuilder.parse();
                        }
                    } catch (Exception e) {
                        e.printStackTrace()
                    }
                }
            };

            refreshRunner.scheduleAtFixedRate(xmlMapperReloader, 0, 5, TimeUnit.SECONDS);
        } catch (e) {
            e.printStackTrace()
        }
    }

    private final Configuration getConfiguration() {
        if (config == null) {
            def field = SqlSessionFactoryBean.class.getDeclaredField('sqlSessionFactory')
            field.setAccessible(true)
            config = (field.get(this) as SqlSessionFactory).getConfiguration()
        }
        return config
    }

    private final Resource[] getMapperLocations() {
        if (locations == null) {
            def field = SqlSessionFactoryBean.class.getDeclaredField('mapperLocations')
            field.setAccessible(true)
            locations = field.get(this)
        }

        return locations
    }

    @Override
    void afterPropertiesSet() throws Exception {
        super.afterPropertiesSet()
        getConfiguration()
        refresh()
    }

    @Override
    void destroy() throws Exception {
        refreshRunner.shutdown()
    }
}