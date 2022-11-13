package com.example;

import com.example.domain.Book;
import com.example.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringHelloSsm2ApplicationTests {
    @Autowired
    private BookService bookService;

    @Test
    void test1() {
        bookService.getAllBooks().forEach(user -> System.out.println(user));
    }
    @Test
    void test2() {
        System.out.println(bookService.getBookById(12));
    }
    @Test
    void test3(){
        boolean flag = bookService.insertBook(new Book(null, "Java", "Eddie Study Java", "persevere"));
        if (flag){
            System.out.println("inset into success");
        }else {
            System.out.println("inset into error");
        }
    }
    @Test
    void test4(){
        boolean flag = bookService.updateBook(new Book(13, "Java", "Eddie Study Java 2", "persevere"));
        if (flag){
            System.out.println("update success");
        }else {
            System.out.println("update error");
        }
    }
    @Test
    void test5(){
        boolean flag = bookService.deleteBook(13);
        if (flag){
            System.out.println("delete success");
        }else {
            System.out.println("delete error");
        }
    }


}
