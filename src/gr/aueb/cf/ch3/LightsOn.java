package gr.aueb.cf.ch3;

import java.util.Scanner;

/*
* Turn lights on when raining  and is it dark and or cari is running >100
* */
public class LightsOn {

    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isDark = false;
        int speed = 0;
        boolean lightsOn = false;
        boolean isCarRunning = false;
        final int MAX_CAR_SPEED = 100;

        Scanner in = new Scanner(System.in);

        System.out.println("Is it raining? ");
        isRaining = in.nextBoolean();
        System.out.println("Is it dark? ");
        isDark = in.nextBoolean();
        System.out.println("Please insert speed: "+ speed);
        speed = in.nextInt();
        isCarRunning = speed > MAX_CAR_SPEED;
        lightsOn = (isRaining && isDark) || (isDark && isCarRunning );
        System.out.println("The lights are: " + lightsOn);






    }
}
