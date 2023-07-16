package com.programmers.reactApp.controller.dto;

import com.programmers.reactApp.model.Category;

public record CreateProductRequest(
        String productName, Category category, long price, String description
) {
}
