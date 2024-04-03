package com.example.bookorder.service;

import com.example.bookorder.common.DiscountPolicy;
import com.example.bookorder.domain.Book;
import com.example.bookorder.dto.ResBookListDto;
import com.example.bookorder.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public ResBookListDto getBookList() {
        List<Book> bookList = bookRepository.findAll();
        LocalDate localDate = LocalDate.now();

        List<ResBookListDto.BookInfo> bookInfoList = new ArrayList<>();
        for (Book book : bookList) {
            ResBookListDto.BookInfo bookInfo = new ResBookListDto.BookInfo();

            DiscountPolicy discountPolicy = new DiscountPolicy();

            String category = book.getCategory();
            int price = book.getPrice();

            int discountedPrice = discountPolicy.getFridaysProgrammingBookDiscount(price, localDate, category);

            if (category.equals("culture")) {
                discountedPrice = discountPolicy.getCultureCategoryBook(price);
            }

            bookInfo.setId(book.getId());
            bookInfo.setName(book.getId());
            bookInfo.setCategory(book.getCategory());
            bookInfo.setOriginalPrice(book.getPrice());
            bookInfo.setDiscountPrice(discountedPrice);

            bookInfoList.add(bookInfo);
        }
        return new ResBookListDto("0000", "전체 도서 목록 조회 성공", bookInfoList);
    }
}
