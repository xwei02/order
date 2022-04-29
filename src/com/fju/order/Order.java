package com.fju.order;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

public class Order {
    int amount;
    Delivery delivery;
    int shipFee;

    public Order(int amount, Delivery delivery, int shipFee) {
        this.amount = amount;
        this.delivery = delivery;
        this.shipFee = shipFee;

    }

    public int total() {
        if (delivery instanceof )

    }
}