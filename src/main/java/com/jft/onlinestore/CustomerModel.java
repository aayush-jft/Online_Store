package com.jft.onlinestore;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CustomerModel {
    private long customerId;
    private Long customerPhone;
    private String customerName, customerUsername, customerPassword;
}