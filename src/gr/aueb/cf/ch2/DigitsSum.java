package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DigitsSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int firstnum = 0;
        int lastnum = 0;
        int sum = 0;

        System.out.println("Please enter number: ");
        num1 = in.nextInt();
        firstnum = num1 / 10;
        lastnum = num1 % 10;
        sum = firstnum + lastnum;
        System.out.printf("%d + %d = %d" ,firstnum,lastnum,sum);

    }
}
