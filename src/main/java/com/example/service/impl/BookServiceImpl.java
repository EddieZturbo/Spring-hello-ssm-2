package com.example.service.impl;

import com.example.dao.BookDAO;
import com.example.domain.Book;
import com.example.exception.SystemException;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 @author EddieZhang
 @create 2022-11-10 13:27
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDAO bookDAO;

    @Override
    public List<Book> getAllBooks() {
//        try {
//            int num = 110 / 0;
//        } catch (Exception e) {
//            throw new SystemException(50032,"这里是MySystemException\t 等我抽完这只烟先",e);
//        }
        return bookDAO.queryAllBook();
    }

    @Override
    public Book getBookById(Integer id) {
        return bookDAO.queryBookById(id);
    }

    @Override
    public boolean insertBook(Book book) {
        if (bookDAO.insertBook(book) > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateBook(Book book) {
        if (bookDAO.updateBook(book) > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteBook(Integer id) {
        if (bookDAO.deleteBookById(id) > 0) {
            return true;
        } else {
            return false;
        }
    }
}
