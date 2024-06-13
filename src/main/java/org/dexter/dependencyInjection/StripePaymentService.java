package org.dexter.dependencyInjection;

public class StripePaymentService implements PaymentService{
    @Override
    public void processPayment(Order order) {
        //Stripe payment logic
    }
}
