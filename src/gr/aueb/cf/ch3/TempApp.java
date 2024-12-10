package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TempApp {

    public static void main(String[] args) {
        int temp = 0;

        Scanner in = new Scanner(System.in);
        boolean isTempBelowZero;

        System.out.println("Insert temperature: ");
        temp = in.nextInt();

        isTempBelowZero = temp < 0;
        System.out.println("The temperature is below zero: " + isTempBelowZero);
    }
}
