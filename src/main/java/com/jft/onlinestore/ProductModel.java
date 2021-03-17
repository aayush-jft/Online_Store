package com.jft.onlinestore;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductModel {
    private long productId;
    private String productName, productCategory;
}