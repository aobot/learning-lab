package com.reload.model

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import gson.test.ext.FlyHolderDeserializer
import gson.test.ext.FlyHolderSerializer
import gson.test.model.FlyHolder
import gson.test.model.impl.Bird
import gson.test.model.impl.FlyComplex
import gson.test.model.impl.Hawk

/**
 * Created by aobot on 2016-08-11 10:21.
 */
class IFlyTest extends GroovyTestCase {
    def holder = new FlyHolder([
            "${Bird.class.canonicalName}"      : new Bird('aaa'),
            "${Hawk.class.canonicalName}"      : new Hawk(1),
            "${FlyComplex.class.canonicalName}": new FlyComplex(new Bird('x'), new Hawk(1), 'complex', new User(1, 'user'))
    ])
    Gson gson

    @Override
    void setUp() {
        gson = new GsonBuilder().
                registerTypeAdapter(FlyHolder.class, new FlyHolderDeserializer()).
                registerTypeAdapter(FlyHolder.class, new FlyHolderSerializer()).
                create()
    }

    void testSetName() {
        def string = gson.toJson(holder, FlyHolder.class)
        println string
        def a = gson.fromJson(string, FlyHolder.class)
        println a
    }
}
