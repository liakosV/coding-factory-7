package gr.aueb.cf.ch7;

import java.util.Scanner;

public class IOStrApp  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please insert 2 string: ");
        s1 = in.next(); //διαβαζει μεχρι να βρει whitespace (spaces, \t, \n)
        s2 = in.nextLine(); //Διαβαζει τα παντα μεχρι να βρει \n (Enter)

        System.out.printf("s1: %s\n", s1);
        System.out.printf("s2: %s\n", s2);
    }
}
