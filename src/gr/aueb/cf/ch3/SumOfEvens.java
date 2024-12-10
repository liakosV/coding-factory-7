package gr.aueb.cf.ch3;

/*
* Υπολογιζει το αθροισμα των αρτιων
* απο το 2 μεχρι ενα οριο που δινει ο χρηστης*/

import java.util.Scanner;

public class SumOfEvens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Insert upper limit: ");
        inputNum = scanner.nextInt();

        while (i <= inputNum) {
            sum += i;
            i+= 2;

        }
        System.out.println("the sum of even numbers up to " + inputNum + " is: " + sum);
    }
}
