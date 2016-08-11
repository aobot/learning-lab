package com.reload.model

import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer

import java.lang.reflect.Type

/**
 * Created by aobot on 2016-08-11 11:23.
 */
class FlyHolderSerializer implements JsonSerializer<FlyHolder> {
    private static final def gson = new Gson()

    JsonElement serialize(FlyHolder holder, Type typeOfSrc, JsonSerializationContext context) {
        def obj = new JsonObject()
        obj.addProperty('holder', gson.toJson(holder?.holder))
        return obj
    }
}
