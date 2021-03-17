package com.jft.onlinestore;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CartModel {
    private long customerId, productId, quantity;
    private String productName;
}