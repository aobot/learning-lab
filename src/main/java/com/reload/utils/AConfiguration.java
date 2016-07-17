package com.reload.utils;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.Configuration;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AConfiguration extends Configuration {

    protected final Map<String, MappedStatement> mappedStatements = new ConcurrentHashMap<String, MappedStatement>();

    public AConfiguration(Configuration configuration) {
        this(configuration.getEnvironment());
    }

    public AConfiguration(Environment environment) {
        super(environment);
    }


    @Override
    public void addMappedStatement(MappedStatement ms) {
        mappedStatements.put(ms.getId(), ms);
    }

    @Override
    public Collection<String> getMappedStatementNames() {
        buildAllStatements();
        return mappedStatements.keySet();
    }

    @Override
    public Collection<MappedStatement> getMappedStatements() {
        buildAllStatements();
        return mappedStatements.values();
    }

    @Override
    public MappedStatement getMappedStatement(String id) {
        MappedStatement stat = this.getMappedStatement(id, true);
        return stat;
    }

    @Override
    public MappedStatement getMappedStatement(String id, boolean validateIncompleteStatements) {
        if (validateIncompleteStatements) {
            buildAllStatements();
        }

        MappedStatement stat = this.mappedStatements.get(id);
        return stat;
    }

    @Override
    public boolean hasStatement(String statementName) {
        return hasStatement(statementName, true);
    }

    @Override
    public boolean hasStatement(String statementName, boolean validateIncompleteStatements) {
        if (validateIncompleteStatements) {
            buildAllStatements();
        }
        return mappedStatements.containsKey(statementName);
    }
}
