package gr.aueb.cf.ch3;

/*
* Βρισκει το πρωτο αριστερα ψηφιο
* ενος ακεραιου
* */

import java.util.Scanner;

public class FirstDigitFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int tempNum = 0;


        System.out.println("Please enter a positive number: ");
        inputNum = scanner.nextInt();
        tempNum = inputNum;

        while (tempNum >= 10) {

           tempNum /= 10;

        }

        System.out.println("The first num is : " + tempNum );
    }
}
