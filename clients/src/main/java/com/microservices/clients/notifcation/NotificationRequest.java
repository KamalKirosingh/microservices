package com.microservices.clients.notifcation;


public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerName,
        String message
) {
}