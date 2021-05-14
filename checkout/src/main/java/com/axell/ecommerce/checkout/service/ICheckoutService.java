package com.patrik.ecommerce.checkout.service;

import com.patrik.ecommerce.checkout.controller.checkout.CheckoutRequest;
import com.patrik.ecommerce.checkout.entity.Checkout;

import java.util.Optional;

public interface ICheckoutService {
    Optional<Checkout> create(CheckoutRequest checkoutRequest);
    Optional<Checkout> updateStatus(String checkoutCode, Checkout.Status status);
}
