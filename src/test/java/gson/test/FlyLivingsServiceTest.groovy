package gson.test

import gson.test.model.FlyHolder
import gson.test.model.FlyLivings
import gson.test.model.impl.Bird
import gson.test.model.impl.FlyComplex
import gson.test.model.impl.Hawk
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

import javax.annotation.Resource

/**
 * Created by aobot on 2016-08-11 14:41.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = [
        "classpath*:reload/myBatis-config.xml",
        "classpath*:reload/reload.xml",
        "classpath*:gson/fly-mapper.xml"
])
public class FlyLivingsServiceTest {
    @Resource
    FlyLivingsService flyLivingsService

    @Test
    public void add() throws Exception {
        def map = [
                "${Bird.class.canonicalName}"      : new Bird('a'),
                "${Hawk.class.canonicalName}"      : new Hawk(999),
                "${FlyComplex.class.canonicalName}": new FlyComplex(new Bird('f-bird'), new Hawk(-1), 'complex')
        ]
        def living = new FlyLivings(holder: new FlyHolder(map))
        flyLivingsService.add(living)
    }

    @Test
    public void getAll() throws Exception {
        println flyLivingsService.getAll().join("\n")
    }

}