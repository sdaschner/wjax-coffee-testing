package com.sebastian_daschner.coffee_testing;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class CoffeeBean {

    @Inject
    CoffeeControl control;

    public String getCoffee() {
        final String message = control.getCoffee();
        return message + ":" + message.length();
    }

}
