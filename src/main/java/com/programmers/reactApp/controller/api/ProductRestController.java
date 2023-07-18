package com.programmers.reactApp.controller.api;

import com.programmers.reactApp.model.Category;
import com.programmers.reactApp.model.Product;
import com.programmers.reactApp.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductRestController {
    private final ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/v1/products")
    public ResponseEntity<List<Product>> productList(@RequestParam Optional<Category> category) {
        List<Product> findProducts = category
                .map(productService::getProductsByCategory)
                .orElse(productService.getAllProducts());
        return new ResponseEntity<>(findProducts, HttpStatus.OK);
    }
}
