package com.example.bookorder.repository;

import java.util.Optional;

public interface DiscountRepo {
    Optional<BookList> findByName(String name);
}
