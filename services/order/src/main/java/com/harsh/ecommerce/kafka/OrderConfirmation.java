package com.harsh.ecommerce.kafka;

import com.harsh.ecommerce.customer.CustomerResponse;
import com.harsh.ecommerce.order.PaymentMethod;
import com.harsh.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
