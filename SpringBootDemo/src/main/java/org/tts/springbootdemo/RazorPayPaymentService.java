package org.tts.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class RazorPayPaymentService implements PaymentService {

    @Override
    public String pay(){
         String payment = "RazorPay Payment";
         System.out.println("Payment from: "+payment);
         return payment;
     }
}
