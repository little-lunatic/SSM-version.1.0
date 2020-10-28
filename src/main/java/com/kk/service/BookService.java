package com.kk.service;

import com.kk.pojo.Books;

import java.util.List;

public interface BookService {
//    增
    int addBook(Books books);

    int deleteBook(int id);

    int updateBook(Books books);

    Books queryById(int id);

    List<Books> queryAllBook();

    List<Books> fyAllBook();
}
