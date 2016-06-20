package com.loader;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by @ssysong.ssy  2016-06-09 19:29
 */
public class HotSwapClassLoader extends URLClassLoader{
    public HotSwapClassLoader(URL[] urls) {
        super(urls);
    }

    public HotSwapClassLoader(URL[] urls, ClassLoader parent) {
        super(urls, parent);
    }

    public Class<?> load(String name) throws ClassNotFoundException {
        return load(name,false) ;
    }

    protected Class<?> load(String name, boolean resolve) throws ClassNotFoundException {
        if (null != findLoadedClass(name)){
            return reload(name ,resolve) ;
        }

        Class<?> clazz = super.findClass(name) ;
        if (resolve){
           super.resolveClass(clazz);
        }

        return clazz ;
    }

    private Class<?> reload(String name, boolean resolve) throws ClassNotFoundException {
        return new HotSwapClassLoader(getURLs(),getParent()).loadClass(name,resolve) ;
    }
}
