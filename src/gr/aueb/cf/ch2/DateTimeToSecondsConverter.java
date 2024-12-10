package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

public class DateTimeToSecondsConverter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputdays = 0;
        int inputhours = 0;
        int inputminutes = 0;
        int inputseconds = 0;

        System.out.println("Please insert Days, Hours, Minutes and Seconds");
        inputdays = in.nextInt();
        inputhours = in.nextInt();
        inputminutes = in.nextInt();
        inputseconds = in.nextInt();
        inputseconds = (inputdays * 24 * 60 * 60) + (inputhours * 60 * 60) + (inputminutes * 60);
        System.out.printf(Locale.US,"Total seconds: %,d " , inputseconds);



    }
}
