package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Scanner demo. reads two int from the
 * std input (keyboard) and calculate the result
 */

public class ScannerAddApp {

    public static void main(String[] args) {

//        Δηλωση και αρχικοποιηση μεταβλητων
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

//        Εντολες
        System.out.println("Please insert two integers.");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

//        Εκτυπωση αποτελσματων
        System.out.println("Το αθροισμα των δυο ειναι: " + sum);

    }
}
