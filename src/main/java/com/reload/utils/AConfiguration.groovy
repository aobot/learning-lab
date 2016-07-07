package com.reload.utils

import org.apache.ibatis.mapping.MappedStatement
import org.apache.ibatis.session.Configuration
import org.apache.ibatis.mapping.Environment
/**
 * Created by @ssysong.ssy  2016-06-20 17:20
 */
class AConfiguration extends Configuration{
    Configuration configuration

    AConfiguration(Environment environment) {
        super(environment)
    }

    AConfiguration(Configuration configuration) {
        this.configuration = configuration
    }

    AConfiguration() {
    }

    @Override
    void addMappedStatement(MappedStatement ms) {
        if (mappedStatementNames.contains(ms.getId())){
            mappedStatementNames.remove(ms.getId())
        }

        mappedStatements.put(ms.getId(), ms);
    }

}
