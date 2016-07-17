package temp

import java.lang.reflect.Field
import java.util.concurrent.ConcurrentHashMap

/**
 * Created by @ssysong.ssy  2016-07-17 12:12
 */
class Derived extends FinalValue{

    public static void main(String[] args) {

        def obj = new Derived()

        def clazz = Derived.class
        while (!clazz.getDeclaredFields()*.getName().find {it == 'map'}){
            clazz=clazz.getSuperclass()
        }

        Field field
        if (clazz != Object.class){
            field = clazz.getDeclaredField('map')
            field.setAccessible(true)
            def map = field.get(obj)
            map = new ConcurrentHashMap()
            println ''
        }

    }
}
