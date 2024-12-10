package gr.aueb.cf.ch3;

/*
* Υπολογιζει το αθροισμα ενος ακεραιου
* Για παραδειγμα το αθροισμα του 123
* ειναι 6
*/

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int inputNum= 0;
        int tempNum = 0;
        int righDigit = 0;

        System.out.println("Enter podsitive integer: ");
        inputNum = scanner.nextInt();
        tempNum = inputNum;

        while (tempNum > 0) {
            righDigit = tempNum % 10;
            sum += righDigit; // sum = sum + rightDigit
            tempNum /= 10; //tempNum = tempNum /10;

        }

        System.out.println("The sum of digits of: " + inputNum + " is: " + sum );
    }
}
