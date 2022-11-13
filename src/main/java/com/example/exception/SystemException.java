package com.example.exception;

/**
 @author EddieZhang
 @create 2022-11-10 14:46
 */
public class SystemException extends RuntimeException{
    @java.io.Serial
    static final long serialVersionUID = -7034897190743546939L;
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SystemException(Integer code,String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public SystemException(Integer code,String message) {
        super(message);
        this.code = code;
    }
}
