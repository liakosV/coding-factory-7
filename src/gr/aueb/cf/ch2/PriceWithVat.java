package gr.aueb.cf.ch2;

/*
*Calculates the price with vat. */

import java.util.Scanner;

public class PriceWithVat {

    public static void main(String[] args) {
        final double VAT_RATE = 0.24;
        double price = 0;
        double vat = 0;
        double priceWithVat = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert price: ");
        price = in.nextDouble();
        vat = price * VAT_RATE;
        priceWithVat = vat + price;

        System.out.printf("Price: %.2f, Vat: %.2f, Price with Vat: %.2f" , price , vat, priceWithVat);

    }
}
