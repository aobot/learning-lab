package groovy

import java.text.SimpleDateFormat

/**
 * Created by @ssysong.ssy  2016-06-17 10:43
 */
class GroovyHello implements IHello{
    String name
    @Override
    void say() {
        println  '2X  :  ' + new SimpleDateFormat('hh-mm-ss').format(new Date())
    }
}
