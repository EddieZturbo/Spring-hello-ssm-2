package com.example.service;

import com.example.domain.Book;

import java.util.List;

/**
 @author EddieZhang
 @create 2022-11-10 13:26
 */
public interface BookService {
    /**
     * 获取所有的图书
     * @return
     */
    List<Book> getAllBooks();

    /**
     * 根据id获取指定的图书
     * @param id
     * @return
     */
    Book getBookById(Integer id);

    /**
     * 添加图书
     * @param book
     * @return
     */
    boolean insertBook(Book book);

    /**
     * 更新图书信息
     * @param book
     * @return
     */
    boolean updateBook(Book book);

    /**
     * 根据id删除指定的图书
     * @param id
     * @return
     */
    boolean deleteBook(Integer id);
}
