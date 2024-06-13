package org.dexter.dependencyInjection;

public class OrderProcessor {

    private PaymentService paymentService;
    private NotificationService notificationService;


    public OrderProcessor(PaymentService paymentService, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    public void processOrder(Order order){
        paymentService.processPayment(order);
        notificationService.sendNotification(order);
    }
}
