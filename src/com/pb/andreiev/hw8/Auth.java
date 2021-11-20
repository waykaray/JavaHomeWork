package com.pb.andreiev.hw8;

import java.util.Objects;
import java.util.regex.Pattern;

public class Auth {
    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException,WrongPasswordException{

        if (!Pattern.matches("[a-zA-Z0-9]{5,20}",login)) throw new WrongLoginException("Длинна должна быть от 5 до 20 символов. " +
                "Login должен содержать только латинские буквы и цифры");
        if (!Pattern.matches("\\w{5,}+",password)) throw new WrongPasswordException("Длинна должна быть более 5, только латинские " +
                "буквы и цифры и знак подчеркивания.");
        if (!Objects.equals(password,confirmPassword)) throw new WrongPasswordException("password и confirmPassword должны совпадать");
        this.login = login;
        this.password = password;
    };
    public void signIn(String login, String password) throws WrongLoginException {
        if (Objects.equals(login,this.login) && Objects.equals(password,this.password)) System.out.println("Успех");
        else throw new WrongLoginException("Не верный логин или пароль");
    }

}