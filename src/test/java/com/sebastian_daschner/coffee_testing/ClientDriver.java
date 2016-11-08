package com.sebastian_daschner.coffee_testing;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ClientDriver {

    private Client client;
    private WebTarget target;

    public void setUp() {
        client = ClientBuilder.newClient();
        target = client.target("http://localhost:8080/coffee-testing/resources/coffee");
    }

    public String getCoffee() {
        final Response response = target.request().get();
        Assert.assertThat(response.getStatusInfo().getFamily(), CoreMatchers.is(Response.Status.Family.SUCCESSFUL));
        return response.readEntity(String.class);
    }

}