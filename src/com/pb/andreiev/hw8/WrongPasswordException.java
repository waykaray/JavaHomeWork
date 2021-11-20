package com.pb.andreiev.hw8;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(){

    }
    public WrongPasswordException(String s){
        super(s);
    }

}
