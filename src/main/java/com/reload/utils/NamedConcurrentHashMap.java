package com.reload.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NamedConcurrentHashMap<V> extends ConcurrentHashMap<String, V> {

    private static final long serialVersionUID = 380791550843130893L;
    private String name;


    public NamedConcurrentHashMap(String name, int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
        this.name = name;
    }

    public NamedConcurrentHashMap(String name, int initialCapacity) {
        super(initialCapacity);
        this.name = name;
    }
    public NamedConcurrentHashMap(String name) {
        super();
        this.name = name;
    }

    public NamedConcurrentHashMap(String name, Map<String, ? extends V> m) {
        super(m);
        this.name = name;
    }


    private String getShortName(String key) {
        final String[] keyparts = key.split("\\.");
        return keyparts[keyparts.length - 1];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
