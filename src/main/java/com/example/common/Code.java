package com.example.common;

/**
 @author EddieZhang
 @create 2022-11-06 20:14
 */
public class Code {
//    SAVE_OK(20011),DELETE_OK(20021),UPDATE_OK(20031),SELECT_OK(20041),
//    SAVE_ERR(20010),DELETE_ERR(20020),UPDATE_ERR(20030),SELECT_ERR(20040),
//    SYSTEM_ERR(50001),SYSTEM_TIMEOUT_ERR(50002),SYSTEM_UNKNOWN_ERR(59999),BUSINESS_ERR(60002);
//    private Integer value;
//    private Code(Integer value){
//        this.value = value;
//    }
        public static final Integer SAVE_OK =  20011;
        public static final Integer DELETE_OK =  20021;
        public static final Integer UPDATE_OK =  20031;
        public static final Integer SELECT_OK =  20041;

        public static final Integer SAVE_ERR =  20010;
        public static final Integer DELETE_ERR =  20020;
        public static final Integer UPDATE_ERR =  20030;
        public static final Integer SELECT_ERR =  20040;

        public static final Integer SYSTEM_ERR = 50001;
        public static final Integer SYSTEM_TIMEOUT_ERR = 50002;
        public static final Integer SYSTEM_UNKNOWN_ERR = 59999;

        public static final Integer BUSINESS_ERR = 60002;
}
