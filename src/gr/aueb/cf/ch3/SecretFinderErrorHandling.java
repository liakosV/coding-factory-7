package gr.aueb.cf.ch3;

import java.util.Scanner;

/*
 * Linearize the branches and check
 * errors first.
*/

public class SecretFinderErrorHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 12;
        int num = 0;
        boolean isSuccess = false;

        while (true) {
            System.out.println("insert the num to guess the secret: ");
            num = scanner.nextInt();

            if (num != SECRET) {
                System.out.println("Try again");
                continue;
            }
            System.out.println("Bingo!!!");
            break;
        }
    }
}
