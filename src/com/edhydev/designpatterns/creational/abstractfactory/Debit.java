package com.edhydev.designpatterns.creational.abstractfactory;

public class Debit implements PaymentMethod {

    @Override
    public String doPayment() {
        return "Pago a Débito";
    }
}
