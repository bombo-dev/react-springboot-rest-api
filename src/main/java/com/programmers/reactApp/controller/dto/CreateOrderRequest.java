package com.programmers.reactApp.controller.dto;

import com.programmers.reactApp.model.OrderItem;

import java.util.List;

public record CreateOrderRequest(
        String email, String address, String postcode, List<OrderItem> orderItems
) {
}
