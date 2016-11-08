package com.sebastian_daschner.coffee_testing;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coffee {

    @Id
    private long id;
    private String name;

    @Column(name = "coffee_order")
    private String order;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(final String order) {
        this.order = order;
    }

}
