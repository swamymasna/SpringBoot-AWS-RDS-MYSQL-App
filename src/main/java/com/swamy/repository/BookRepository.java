package com.swamy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swamy.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
