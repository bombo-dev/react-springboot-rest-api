package com.programmers.reactApp.service;

import com.programmers.reactApp.model.Email;
import com.programmers.reactApp.model.Order;
import com.programmers.reactApp.model.OrderItem;

import java.util.List;

public interface OrderService {
    Order createOrder(Email email, String address, String postcode, List<OrderItem> orderItems);
}
