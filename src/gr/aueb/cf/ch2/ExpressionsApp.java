package gr.aueb.cf.ch2;

public class ExpressionsApp {
    public static void main(String[] args) {
        int num1 =  10;
        int num2 = 20;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int  mod = 0;
        int result1 = 0;
        int result2 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        result1 = num1++;
        result2 = ++num2;

        System.out.printf(" sum: %d\n sub: %d\n mul: %d\n div: %d\n result1: %d\n result2: %d\n", + sum , +sub , + mul , + div , + result1 , + result2);
    }
}