package com.enums;

public class Test {
    public static void main(String[] args) {

        PaymentType pt = PaymentType.DEBITCARD;
//        System.out.println(pt);

        PaymentType[] paymentTypes = PaymentType.values();

        for (PaymentType paymentType: paymentTypes) {
            System.out.println(paymentType);
            System.out.println(paymentType.ordinal());
            System.out.println(paymentType.getFee());
        }
    }
}
