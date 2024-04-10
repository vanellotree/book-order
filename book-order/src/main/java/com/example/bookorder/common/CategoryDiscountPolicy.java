package com.example.bookorder.common;

import com.example.bookorder.domain.Book;

import java.math.BigDecimal;


// TODO: 구현해보기
public class CategoryDiscountPolicy implements DiscountPolicy{

    private double IT_CATEGORY_DISCOUNT_RATE = 0.1;
    private int CULTURE_CATEGORY_DISCOUNT_PRICE = 1500;

    @Override
    public boolean isDiscountable(Book book) {
        if(book.getCategory() == "IT" || book.getCategory() == "NOVEL"){
            return true;
        }
        return false;
    }

    @Override
    public int getDiscountPrice(Book book) {
        switch (book.getCategory()) {
            case "IT":
                // IT 카테고리 중 금요일에만 10% 를 할인하는 것인데 어떻게 코드 작성하면 좋을지...

                return (int) (book.getPrice() * IT_CATEGORY_DISCOUNT_RATE);
            case "CULTURE":
                return CULTURE_CATEGORY_DISCOUNT_PRICE;
        }
        return 0;
    }
}
