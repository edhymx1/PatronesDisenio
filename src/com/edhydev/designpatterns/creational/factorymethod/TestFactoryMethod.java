package com.edhydev.designpatterns.creational.factorymethod;

public class TestFactoryMethod {
    public static void test() {
        Payment payment = PaymentFactory.builPayment(TypePayment.CARD);
        payment.doPayment();
    }
}
