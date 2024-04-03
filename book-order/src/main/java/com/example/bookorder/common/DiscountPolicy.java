package com.example.bookorder.common;

import com.example.bookorder.domain.Book;


public interface DiscountPolicy {

        boolean isDiscountable(Book book);

        int getDiscountPrice(Book book);
}
