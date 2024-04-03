package com.example.bookorder.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Table
public class BookSale {
    @Id // 키값. auto-increment
    private String id;

    private String paymentMethod;

    private String paymentAmount;

    private LocalDate date;

    private List<PaymentDetail> paymentDetail;

    public static class PaymentDetail {
        private String originalPrice;
        private String discountPrice;
        private String changeAmount;
    }
}
