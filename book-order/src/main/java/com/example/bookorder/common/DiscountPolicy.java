package com.example.bookorder.common;

import com.example.bookorder.domain.Book;

import java.math.BigDecimal;


public interface DiscountPolicy {

        boolean isDiscountable(Book book);

        int getDiscountPrice(Book book);
}
