package gson.test.ext

import com.google.gson.*
import gson.test.model.FlyHolder
import gson.test.model.IFly

import java.lang.reflect.Type

/**
 * Created by aobot on 2016-08-11 10:40.
 */
class FlyHolderDeserializer implements JsonDeserializer<FlyHolder> {
    private Gson gson = new Gson()

    FlyHolder deserialize(JsonElement json, Type typeOfT,
                          JsonDeserializationContext context) throws JsonParseException {
        Map<Class, IFly> flyMap = gson.fromJson(json.members['holder'].value, Map)
        def holder = flyMap.collectEntries {[it.key, Class.forName(it.key).newInstance(it.value as Map)]}
        return new FlyHolder(holder)
    }
}
