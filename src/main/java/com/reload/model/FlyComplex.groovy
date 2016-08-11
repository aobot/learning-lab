package com.reload.model

import groovy.transform.Canonical

/**
 * Created by aobot on 2016-08-11 11:19.
 */

@Canonical
class FlyComplex implements IFly{
    Bird bird
    Hawk hawk
    String name
    User user

}
