package gson.test.model

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import gson.test.ext.FlyHolderDeserializer
import gson.test.ext.FlyHolderSerializer
import gson.test.model.impl.Bird
import gson.test.model.impl.FlyComplex
import gson.test.model.impl.Hawk

/**
 * Created by aobot on 2016-08-11 14:13.
 */
class FlyHolderTest extends GroovyTestCase {
    static Gson gson


    void setUp() {
        gson = new GsonBuilder().registerTypeAdapter(FlyHolder.class, new FlyHolderDeserializer()).
                registerTypeAdapter(FlyHolder.class, new FlyHolderSerializer()).
                create()
    }

    void testGetHolder() {
        def holder = new FlyHolder([
                "${Bird.class.canonicalName}"      : new Bird('b'),
                "${Hawk.class.canonicalName}"      : new Hawk(99),
                "${FlyComplex.class.canonicalName}": new FlyComplex(new Bird('x'), new Hawk(99), 'go')
        ])

        def json = gson.toJson(holder, FlyHolder.class)
        println json
        def obj = gson.fromJson(json, FlyHolder.class)
        println obj
    }
}
