package com.example.controller;

import com.example.common.Code;
import com.example.common.Result;
import com.example.domain.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 @author EddieZhang
 @create 2022-11-10 13:39
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/getAllBooks")
    public Result getAllBooks(){
        List<Book> books = bookService.getAllBooks();
        int size = bookService.getAllBooks().size();
        System.out.println("Eddie modify");
        return new Result(size > 0 ? Code.SELECT_OK : Code.SELECT_ERR,books,size > 0 ? "" : "查询失败");
    }

    @GetMapping("/getBookById/{id}")
    public Result getBookById(@PathVariable Integer id){
        Book book = bookService.getBookById(id);
        return new Result(book != null ? Code.SELECT_OK : Code.SELECT_ERR,book,book != null ? "" : "查询失败");
    }

    @PostMapping("/insertBook")
    public Result insertBook(@RequestBody Book book){
        boolean flag = bookService.insertBook(book);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR,flag ? "添加成功" : "添加失败");
    }

    @PutMapping("/updateBook")
    public Result updateBook(@RequestBody Book book){
        boolean flag = bookService.updateBook(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR,flag ? "更新成功" : "更新失败");
    }

    @DeleteMapping("/deleteBook/{id}")
    public Result deleteBook(@PathVariable Integer id){
        boolean flag = bookService.deleteBook(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR,flag ? "删除成功" : "删除失败");
    }

}
