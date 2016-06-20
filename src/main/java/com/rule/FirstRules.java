package com.rule;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by @ssysong.ssy  2016-06-07 21:37
 */
@Component("firstRules")
@Rule(name = "firstRule", description = "this is my first rule")
public class FirstRules {

    @Value("hello,world")
    private String data = "";

    @Condition
    public boolean when() {
        return data.length() > 2;
    }


    @Action
    public void then() {
        System.out.println("hey ," + data);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
