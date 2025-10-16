package org.tts.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class StripePaymentService implements PaymentService{
    @Override
    public String pay() {
        String payment = "Stripe Payment";
        System.out.println("Payment from: "+payment);
        return payment;
    }
}
