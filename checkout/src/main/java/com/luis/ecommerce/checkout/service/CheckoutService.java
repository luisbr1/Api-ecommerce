package com.luis.ecommerce.checkout.service;

import com.luis.ecommerce.checkout.entity.CheckoutEntity;
import com.luis.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
