package com.patrik.ecommerce.payment.service;

import com.patrik.ecommerce.payment.entity.Payment;
import com.patrik.ecommerce.checkout.event.CheckoutCreatedEvent;

import java.util.Optional;

public interface IPaymentService {
    Optional<Payment> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
