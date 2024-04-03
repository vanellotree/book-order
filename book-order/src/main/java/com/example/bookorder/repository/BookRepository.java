package com.example.bookorder.repository;


import com.example.bookorder.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    Optional<BookList> findByName(String name);
    Optional<BookList> findByCategory(String category);
}
