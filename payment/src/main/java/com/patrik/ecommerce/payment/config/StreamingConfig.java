package com.patrik.ecommerce.payment.config;

import com.patrik.ecommerce.payment.streaming.CheckoutProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutProcessor.class
})
public class StreamingConfig {
}
