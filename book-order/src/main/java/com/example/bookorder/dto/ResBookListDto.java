package com.example.bookorder.dto;

import com.example.bookorder.domain.Book;
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
        private Long id;
        private String name;
        private String category;
        private int originalPrice;
        private int discountPrice;

        public BookInfo() {
        }

        public BookInfo(Book book) {
            this.id = id;
            this.name = name;
            this.category = category;
            this.originalPrice = originalPrice;
            this.discountPrice = discountPrice;
        }
    }
}
