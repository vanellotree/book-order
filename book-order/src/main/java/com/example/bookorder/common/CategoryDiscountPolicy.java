package com.example.bookorder.common;

import com.example.bookorder.domain.Book;

import java.time.DayOfWeek;
import java.time.LocalDateTime;


// TODO: 구현해보기
public class CategoryDiscountPolicy implements DiscountPolicy{


    @Override
    public boolean isDiscountable(Book book) {
        if(book.getCategory() == "IT" || book.getCategory() == "NOVEL"){
            return true;
        }
        return false;
    }

    @Override
    public int getDiscountPrice(Book book) {
        return 1000;
    }
}
