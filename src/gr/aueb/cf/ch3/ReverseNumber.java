package gr.aueb.cf.ch3;

import java.util.Scanner;

/*
* Αντιστρεφει εναν ακεραιο
* πχ το 123 γινεται 321*/
public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int reversed = 0;
        int tempNum = 0;
        int lastDigit = 0;
        System.out.println("Insert integer: ");
        num = scanner.nextInt();
        tempNum = num;

        while (tempNum > 0) {
            lastDigit = tempNum % 10;
            System.out.println(lastDigit);
            tempNum /= 10;
            System.out.println(tempNum);
            reversed =  reversed * 10 + lastDigit;
            System.out.println(reversed);
        }

        System.out.println("the reversed number is: " + reversed);

    }
}
