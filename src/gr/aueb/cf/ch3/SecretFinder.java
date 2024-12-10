package gr.aueb.cf.ch3;

import java.util.Scanner;


/*
 * Υπάρχει ένα SECRET που είναι integer και ο
 * χρήστης με μία μόνο προσπάθεια θα προσπαθήσει
 * να τον βρει.
*/
public class SecretFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 12;
        int num = 0;

        System.out.println("insert the num to guess the secret: ");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("Secret found!!!");

        } else { // num !=secret;
            System.out.println("Failure!! :( ");


        }

    }
}
