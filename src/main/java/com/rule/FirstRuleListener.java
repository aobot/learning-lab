package com.rule;

import org.easyrules.api.Rule;
import org.easyrules.api.RuleListener;
import org.springframework.stereotype.Component;

/**
 * Created by @ssysong.ssy  2016-06-07 21:58
 */
@Component("firstRuleListener")
public class FirstRuleListener implements RuleListener{
    public void beforeExecute(Rule rule) {
        System.out.println("before");
    }

    public void onSuccess(Rule rule) {
        System.out.println("success");
    }

    public void onFailure(Rule rule, Exception e) {
        System.out.println("fail");
    }
}
