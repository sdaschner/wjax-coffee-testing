package com.sebastian_daschner.coffee_testing;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SystemtestIT {

    private ClientDriver clientDriver = new ClientDriver();

    @Before
    public void setUp() {
        clientDriver.setUp();
    }

    @Test
    public void test() {
        final String actual = clientDriver.getCoffee();
        assertThat(actual, is("coffee!:7"));
    }

}
