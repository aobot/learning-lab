package gson.test.model.impl

import groovy.transform.Canonical
import gson.test.model.IFly

/**
 * Created by aobot on 2016-08-11 11:19.
 */

@Canonical
class FlyComplex implements IFly{
    Bird bird
    Hawk hawk
    String name

}
