package com.rule;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by @ssysong.ssy  2016-06-07 21:53
 */
@Component("secondRules")
@Rule(name = "secondRules", description = "this is my 2nd rule")
public class SecondRules {

    @Value("2")
    private String data = "";

    @Condition
    public boolean when() {
        return data.length() < 2;
    }


    @Action
    public void then() {
        System.out.println("hey ," + data);
        throw new IllegalStateException();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
