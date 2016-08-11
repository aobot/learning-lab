package com.reload.utils

/**
 * Created by aobot on 2016-08-11 11:50.
 */

def map = [a:1]
println map.collectEntries {[it.key,it.value]}

