package gr.aueb.cf.ch3;

import java.util.Scanner;

public class IsEvenApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        boolean isEven = false;

        System.out.println("Insert number(Integer)");
        num = in.nextInt();

        isEven = num % 2 ==0;

        System.out.printf("%d is even: %b",num ,isEven);

    }
}
