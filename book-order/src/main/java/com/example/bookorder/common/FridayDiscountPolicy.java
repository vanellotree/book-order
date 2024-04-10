package com.example.bookorder.common;

import com.example.bookorder.domain.Book;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDateTime;


// TODO: 구현
public class FridayDiscountPolicy implements DiscountPolicy{

    private double DISCOUNT_RATE = 0.1;

    // TODO: 테스트 불가능한 코드가 있다는 것 인지하기
    @Override
    public boolean isDiscountable(Book book) {
        if(LocalDateTime.now().getDayOfWeek() == DayOfWeek.FRIDAY){
            return true;
        }
        return false;
    }

    @Override
    public int getDiscountPrice(Book book) {
        return 0;
    }


}
