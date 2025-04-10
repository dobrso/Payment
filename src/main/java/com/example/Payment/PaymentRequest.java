package com.example.Payment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentRequest {
    private int userId;
    private String itemId;
    private double discount;
}
