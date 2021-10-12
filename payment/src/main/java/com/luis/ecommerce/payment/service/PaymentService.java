package com.luis.ecommerce.payment.service;

import com.luis.ecommerce.checkout.event.CheckoutCreatedEvent;
import com.luis.ecommerce.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
