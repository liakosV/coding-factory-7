package gr.aueb.cf.ch3;

/*Snowing if raining and temp < 0
* */

import java.util.Scanner;

public class SnowingApp {

    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isSnowing = false;
        Scanner in = new Scanner(System.in);
        int temp = 0;
        System.out.println("please isnert if it is raining: ");
        isRaining = in.nextBoolean();
        System.out.println("Insert temprature: ");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing? " + isSnowing);
    }
}
