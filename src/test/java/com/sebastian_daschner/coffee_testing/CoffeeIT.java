package com.sebastian_daschner.coffee_testing;

import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CoffeeIT {

    private EntityManager entityManager;
    private EntityTransaction transaction;

    @Before
    public void setUp() {
        entityManager = Persistence.createEntityManagerFactory("it").createEntityManager();
        transaction = entityManager.getTransaction();
    }

    @Test
    public void test() {
        transaction.begin();

        final Coffee coffee = new Coffee();
        coffee.setName("coffee!");
        entityManager.merge(coffee);

        transaction.commit();
    }

}
