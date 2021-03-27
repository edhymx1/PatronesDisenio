package com.edhydev.designpatterns.creational.abstractfactory;

public class TestAbstractFactory {
    public static void test() {
        AbstractFactory abstractFactory = FactoryProvider.getFactory("Card");
        Card card = (Card) abstractFactory.create("VISA");

        AbstractFactory abstractFactory1 = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod = (PaymentMethod) abstractFactory1.create("DEBIT");

        System.out.println("Una tarjeta de tipo: " + card.getCardType() + " con el método de pago: " + paymentMethod.doPayment());
    }
}
