package com.example.bookorder.service;

import com.example.bookorder.common.CategoryDiscountPolicy;
import com.example.bookorder.common.DiscountPolicy;
import com.example.bookorder.common.OriginDiscountPolicy;
import com.example.bookorder.domain.Book;
import com.example.bookorder.dto.ResBookListDto;
import com.example.bookorder.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// TODO: Spring에서 DI 방법과 장단점 알아보기
@Service // spring에 bean으로 등록 -> spring에서 관리 -> 주입 -> DI
@RequiredArgsConstructor // 생성자 주입
public class BookService {
    private final BookRepository bookRepository;
    // TODO: 구현
    //  service? 객체? repo? 일단 원하시는대로 구현해보기
    // private final DiscountPolicies discountPolicies;

    public ResBookListDto getBookList() {
        List<Book> bookList = bookRepository.findAll();
        LocalDate localDate = LocalDate.now();

        List<ResBookListDto.BookInfo> bookInfoList = new ArrayList<>();
        List<DiscountPolicy> discountPolicies = List.of(
                new CategoryDiscountPolicy()
        );

        for (Book book : bookList) {
            // TODO: OCP 알아보기
            // Open-close Principle

            ResBookListDto.BookInfo bookInfo = null;
            for (DiscountPolicy discountPolicy : discountPolicies) {
                if (discountPolicy.isDiscountable(book)) {
                    int discountPrice = discountPolicy.getDiscountPrice(book);
                    bookInfo = new ResBookListDto.BookInfo(book, discountPrice);
                }
            }


//            // 할인
//            OriginDiscountPolicy discountPolicy = new OriginDiscountPolicy();
//
//            String category = book.getCategory();
//            int price = book.getPrice();
//
//            int discountedPrice = discountPolicy.getFridaysProgrammingBookDiscount(price, localDate, category);
//
//            if (category.equals("culture")) {
//                discountedPrice = discountPolicy.getCultureCategoryBook(price);
//            }


            // TODO: 묻지말고 시켜라. 책임을 할당한 객체에게
            // 내가 다알고있다 == 결합도가 높다 == 변경에 영향을 받는다
//            bookInfo.setId(book.getId());
//            bookInfo.setName(book.getId());
//            bookInfo.setCategory(book.getCategory());
//            bookInfo.setOriginalPrice(book.getPrice());
//            bookInfo.setDiscountPrice(discountedPrice);

            bookInfoList.add(bookInfo);
        }
        return new ResBookListDto("0000", "전체 도서 목록 조회 성공", bookInfoList);
    }
}
