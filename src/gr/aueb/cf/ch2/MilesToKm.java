package gr.aueb.cf.ch2;

/*
* Convert miles to km.*/

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {

       final double KM_PER_MILE = 1.6;
       double km = 0.0;
       double miles = 0.0;
        Scanner in = new Scanner(System.in);
        System.out.println("Insert miles: ");
        miles = in.nextDouble();
        km = miles * KM_PER_MILE;


        System.out.println("The miles in kilometers are: " + km);
    }
}
