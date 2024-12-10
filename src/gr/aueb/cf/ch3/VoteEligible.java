package gr.aueb.cf.ch3;

/*
* Δικαιωμα ψηφου > 18
* Ελεγχει αν μια ηλικια εχει δικαιωμα
* να ψηφισει.
* */

import java.util.Scanner;

public class VoteEligible {

    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        boolean isEligible = false;
        int age = 0;
        final int VOTING_AGE = 18;

        System.out.println("Please insert age: ");
        age = in.nextInt();

        isEligible = age >= VOTING_AGE;
        System.out.printf("can you vote? %b " , isEligible);

    }
}
