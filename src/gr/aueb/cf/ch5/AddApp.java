package gr.aueb.cf.ch5;

/*
* Υπολογιζει το αθροισμα 2 ακεραιων
* με την χρηση μεθοδων.*/

import java.util.Scanner;

public class AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = 0;
        int sub = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        sum = add(a, b);
        sub = AddApp.sub(a , b);

        System.out.println(sum);
        System.out.println(sub);
    }

    /*
    * @param a the first integer.
    * @param b the second integer.
    * @return the sum of the two integers.
    *
    * */

    public static int add(int a , int b) {
//        int result = 0;
//
//        result = a + b;
//
//        return result;
        return a + b;
    }

    /**
     * Subtracts two integers.
     * @param a the first integer to subtract from.
     * @param b the second integer that is subtracted.
     * @return  the subtraction of a - b.
     */
    public static int sub(int a , int b) {
        return a - b;
    }

}
