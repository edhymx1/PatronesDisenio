package com.edhydev.designpatterns.creational.builder;

public class TestBuilder {
    public static void test() {
        Card card = new Card.CardBuilder(
                "VISA",
                "0000 0000 0000 VISA")
                .name("Edgar")
                .expires(2022)
                .credit(true)
                .build();
        System.out.println(card.toString());

        Card card2 = new Card.CardBuilder(
                "MASTERCARD",
                "0000 0000 MAST CARD")
                .build();

        System.out.println(card2.toString());
    }
}
