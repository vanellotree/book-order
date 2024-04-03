package com.example.bookorder;

import com.example.bookorder.controller.BookController;
import com.example.bookorder.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootTest
class BookOrderApplicationTests {
    BookController bookController;

    @Test
    void contextLoads() {
    }

    @Test
    void test() {
        List<Book> bookList = new ArrayList<>();
        bookController.getBookList();

        System.out.println("hh");
    }
}
