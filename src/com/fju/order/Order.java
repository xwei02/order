package com.fju.order;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

public class Order {
    int amount;
    Delivery delivery;
    int shipFeed;

    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;
        this.shipFeed = delivery.price;

    }

    public int total() {
        return amount+shipFeed;

    }
}