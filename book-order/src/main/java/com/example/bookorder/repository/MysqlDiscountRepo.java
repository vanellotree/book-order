package com.example.bookorder.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public class MysqlDiscountRepo implements DiscountRepo {

    @Override
    public Optional<BookList> findByName(String name) {
        return Optional.empty();
    }
}
