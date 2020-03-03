package com.example.demo.util;

import java.io.Serializable;

public class ResponseData<T> implements Serializable {

    public static final long serialVersionUID = 2L;

    public static final int SUCCESS_CODE = 200;

    public static final int FAIL_CODE = 500;

    private T data;

    private String message;

    private int code;

    public static final ResponseData<String> SUCCESS = new ResponseData<String>(null);
    public static final ResponseData<String> FAIL = new ResponseData<String>(null,FAIL_CODE);

    public ResponseData() {
    }

    public ResponseData(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public ResponseData(T data) {
        this.code = SUCCESS_CODE;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "data=" + data +
                ", message='" + message + '\'' +
                ", code=" + code +
                '}';
    }
}
