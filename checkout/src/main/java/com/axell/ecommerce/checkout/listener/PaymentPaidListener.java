package com.patrik.ecommerce.checkout.listener;

import com.patrik.ecommerce.checkout.entity.Checkout;
import com.patrik.ecommerce.checkout.repository.CheckoutRepository;
import com.patrik.ecommerce.checkout.service.CheckoutService;
import com.patrik.ecommerce.payment.event.PaymentCreatedEvent;
import com.patrik.ecommerce.checkout.streaming.PaymentPaidSink;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentPaidListener {
    private final CheckoutService checkoutService;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent event) {
        checkoutService.updateStatus(event.getCheckoutCode().toString(), Checkout.Status.APPROVED);
    }
}
