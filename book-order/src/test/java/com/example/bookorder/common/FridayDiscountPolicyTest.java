package com.example.bookorder.common;

import com.example.bookorder.domain.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FridayDiscountPolicyTest {

    @Test
    void isDiscountable() {
        // given
        FridayDiscountPolicy fridayDiscountPolicy = new FridayDiscountPolicy();
        Book book = new Book();

        //when
        boolean discountable = fridayDiscountPolicy.isDiscountable(book);

        //then
        assertTrue(discountable);
    }
}