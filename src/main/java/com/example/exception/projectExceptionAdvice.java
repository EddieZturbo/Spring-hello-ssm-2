package com.example.exception;

import com.example.common.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 @author EddieZhang
 @create 2022-11-10 14:43
 */
@RestControllerAdvice
public class projectExceptionAdvice{

    @ExceptionHandler(ArithmeticException.class)
    public Result doSystemException(ArithmeticException arithmeticException){
        return new Result(10001,arithmeticException,"这里是ArithmeticException\t等我抽完这只烟先");
    }

    @ExceptionHandler(SystemException.class)
    public Result doMySystemException(SystemException systemException){
        return new Result(systemException.getCode(),systemException,systemException.getMessage());
    }


}
