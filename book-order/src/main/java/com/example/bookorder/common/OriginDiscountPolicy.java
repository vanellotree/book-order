package com.example.bookorder.common;

import java.time.LocalDate;

public class OriginDiscountPolicy {

    private double discountRate = 0.1;

    public int getFridaysProgrammingBookDiscount(int price, LocalDate date, String category) {
//        book.get()

        String purchaseDay = date.getDayOfWeek().toString();
        int discountedPrice = 0;
        
        if (purchaseDay.equals("FRIDAY")  && category.equals("IT")) {
            discountedPrice = (int) (price * discountRate);
        }
        return discountedPrice;
    }

    public int getCultureCategoryBook(int price) {
        price -= 1500;
        return price;
    }
}
