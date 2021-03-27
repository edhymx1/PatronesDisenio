package com.edhydev.designpatterns.creational.factorymethod;

public class PaymentFactory {
    public static Payment builPayment(TypePayment typePayment) {
        switch (typePayment) {
            case GOOGLEPAY:
                return new GooglePayment();
            case CARD:
                return new CardPayment();
            default:
                return null;
        }
    }
}
