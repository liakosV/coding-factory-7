package gr.aueb.cf.ch2;

import java.util.Scanner;
import java.lang.Double;

public class EuroUsdConverterApp {

    public static void main(String[] args) {

//        Δηλωση και αρχικοποιηση
        Scanner in = new Scanner(System.in);
        int euro = 0;
        double usd = 0.99;

//        Εντολες
        System.out.println("Please insert Euros");
        euro = in.nextInt();
        usd = euro * 0.99;

//        Αποτελεσμα
        System.out.print(+ euro + " euros is " + usd + " in Usd");
    }
}
