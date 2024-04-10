package com.example.bookorder.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@Table
@Entity
public class Book {

    @Id // 키값. auto-increment
    private String id;

    private String name;
    private String category;
    private int price;

}
