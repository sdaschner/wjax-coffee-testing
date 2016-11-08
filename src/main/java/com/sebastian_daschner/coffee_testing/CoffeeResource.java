package com.sebastian_daschner.coffee_testing;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("coffee")
public class CoffeeResource {

    @Inject
    CoffeeBean coffeeBean;

    @GET
    public String getMessage() {
        return coffeeBean.getCoffee();
    }

}
