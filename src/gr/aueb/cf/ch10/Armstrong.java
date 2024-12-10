package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 *  153 => 1^3 + 5^3 + 3^3
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int numberOfDigits;
        int originalNum;
        int digit;

        System.out.println("Give number: ");
        num = in.nextInt();

        numberOfDigits = String.valueOf(num).length();
        originalNum = num;

        while (num != 0) {
            digit = num % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            num /= 10;

        }

        if (sum == originalNum) {
            System.out.println(originalNum + " ειναι Armstrong");
        }else {
            System.out.println(originalNum + " δεν ειναι Armstrong");
        }

    }
}
