package com.example.bookorder.repository;

import lombok.*;
import org.springframework.data.annotation.Id;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder

public class BookList {
    @Id // 키값. auto-increment
    private String bookId;

    private String name;

    private String category;
    private String price;

}
