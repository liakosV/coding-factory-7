package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SecretWhileFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 12;
        int num = 0;
        boolean isSuccess = false;



        do {
            System.out.println("insert the num to guess the secret: ");
            num = scanner.nextInt();

            if (num == SECRET) {
                System.out.println("Secret found!!!");
                isSuccess = true;

            } else { // num !=secret;
                System.out.println("Fail!! :( Try again. ");


            }
        } while (!isSuccess);

    }
}
