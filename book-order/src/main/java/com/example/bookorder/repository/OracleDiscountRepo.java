package com.example.bookorder.repository;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class OracleDiscountRepo implements DiscountRepo {

    @Override
    public Optional<BookList> findByName(String name) {
        return Optional.empty();
    }
}
