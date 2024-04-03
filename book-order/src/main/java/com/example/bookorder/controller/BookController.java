package com.example.bookorder.controller;

import com.example.bookorder.dto.ResBookListDto;
import com.example.bookorder.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    public ResponseEntity<ResBookListDto> getBookList() {
        ResBookListDto books = bookService.getBookList();

        return new ResponseEntity<>(books, null, HttpStatus.OK);
    }
}
