package com.sebastian_daschner.coffee_testing;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.HashSet;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class CoffeeBeanTest {

    private CoffeeBean cut;

    @Parameterized.Parameter(0)
    public String coffeeMessage;

    @Parameterized.Parameter(1)
    public String expected;

    @Before
    public void setUp() {
        cut = new CoffeeBean();
        cut.control = mock(CoffeeControl.class);
    }

    @Test
    public void test() {
        when(cut.control.getCoffee()).thenReturn(coffeeMessage);
        assertThat(cut.getCoffee(), is(expected));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        final Collection<Object[]> testData = new HashSet<>();
        testData.add(new Object[]{"coffee", "coffee:6"});
        testData.add(new Object[]{"coffee!", "coffee!:7"});
        testData.add(new Object[]{"coffee", "coffee:6"});
        testData.add(new Object[]{"coffee", "coffee:6"});
        testData.add(new Object[]{"coffee", "coffee:6"});
        testData.add(new Object[]{"coffee", "coffee:6"});
        return testData;
    }

}