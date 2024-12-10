package gr.aueb.cf.ch2;

/*
* Convert years (ages) to days
* */

import java.util.Scanner;

public class YearToDays {

    public static void main(String[] args) {

//      Δηλωση και αρχικοποιηση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        final int DAYS_PER_YEAR = 365;
        int age = 0;
        int days = 0;

//      Εντολες
        System.out.println("Please insert your age: ");
        age = scanner.nextInt();

//        Εκτυπωση των αποτελεσματων
        days = age * DAYS_PER_YEAR;
        System.out.println("Your age in days are: " + days);

    }
}
