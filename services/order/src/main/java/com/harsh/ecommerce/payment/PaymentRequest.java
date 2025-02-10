package com.harsh.ecommerce.payment;

import com.harsh.ecommerce.customer.CustomerResponse;
import com.harsh.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
