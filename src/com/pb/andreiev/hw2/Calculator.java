package com.pb.andreiev.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int operand1;
        System.out.println("Введіть першу цифру");
        operand1 = scanner.nextInt();
        System.out.println("Введіть другу цифру");
        int operand2 = scanner.nextInt();
        String sign;
        System.out.println("Введіть знак арифметичної операції");
        sign = scanner.next();
        int result;
        switch(sign){
            case "+":
                result = operand1 + operand2;
                System.out.println(result);
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println(result);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println ("На 0 ділити не можна");
                }
                else {
                    result = operand1 / operand2;
                    System.out.println(result);
                }
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println(result);
                break;
            default:
                System.out.println("Незрозуміла операція");
                break;
        }
    }
}