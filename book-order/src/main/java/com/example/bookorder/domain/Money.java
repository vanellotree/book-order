package com.example.bookorder.domain;

import java.math.BigDecimal;


// TODO: 불변 객체로 한번 만들어보세요
public class Money {
    private BigDecimal value;

    public Money(BigDecimal value) {
        this.value = value;
    }
}
