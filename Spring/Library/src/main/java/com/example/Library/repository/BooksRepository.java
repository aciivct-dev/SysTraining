package com.example.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Library.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {

}
