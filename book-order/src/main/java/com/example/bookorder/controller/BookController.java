package com.example.bookorder.controller;

import com.example.bookorder.dto.ResBookListDto;
import com.example.bookorder.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // controller 보단 api 용도로는 Rest
// @RequestMapping("/book/list")  prefix용
@RequiredArgsConstructor
public class BookController {

//    @Autowired
//    private BookService bookService; // 필드 주입
    private final BookService bookService; // 생성자 주입


    @RequestMapping("/book/list")
    public ResponseEntity<ResBookListDto> getBookList() {
        ResBookListDto books = bookService.getBookList();

        return new ResponseEntity<>(books, null, HttpStatus.OK);
    }
}
