package com.example.dao;
import com.example.domain.Book;
import org.apache.ibatis.annotations.*;
import java.util.List;

/**
 @author EddieZhang
 @create 2022-11-10 13:22
 */
@Mapper
public interface BookDAO {
    @Select("select * from t_book")
    List<Book> queryAllBook();

    @Select("select * from t_book where id = #{id}")
    Book queryBookById(@Param("id") Integer id);

    @Insert("insert into t_book values (null,#{type},#{name},#{description})")
    Integer insertBook(Book book);

    @Update("update t_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    Integer updateBook(Book book);

    @Delete("delete from t_book where id = #{id}")
    Integer deleteBookById(@Param("id") Integer id);
}
