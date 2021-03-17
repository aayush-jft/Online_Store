package com.jft.onlinestore;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AdminModel {

    private long adminId;
    private long productId, adminPhone;
    private String adminName, adminUsername, adminPassword, productName, productCategory;
}