package org.tts.springbootdemo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.service", havingValue = "razorpay")
public class RazorPayPaymentService implements PaymentService {

    @Override
    public String pay(){
         String payment = "RazorPay Payment";
         System.out.println("Payment from: "+payment);
         return payment;
     }
}
