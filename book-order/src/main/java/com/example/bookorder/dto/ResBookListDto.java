package com.example.bookorder.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ResBookListDto {
    private String code;
    private String message;
    private List<BookInfo> bookList;

    @Getter
    @Setter
    public static class BookInfo {
        private String id;
        private String name;
        private String category;
        private int originalPrice;
        private int discountPrice;
    }
}
