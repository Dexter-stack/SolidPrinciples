package org.dexter.dependencyInjection;

public class PaypalPaymentService implements PaymentService{
    @Override
    public void processPayment(Order order) {
        // Paypal payment logic
    }
}
