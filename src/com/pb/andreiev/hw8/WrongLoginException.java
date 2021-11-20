package com.pb.andreiev.hw8;

public class WrongLoginException extends Exception {
    public WrongLoginException() {

    }
    public WrongLoginException(String s){
        super(s);
    }
}