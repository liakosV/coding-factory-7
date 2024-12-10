package gr.aueb.cf.ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws Exception {
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        Scanner in = new Scanner(System.in);



        try {
            System.out.println("Please enter two integers.");
            num1 = in.nextInt();
            num2 = in.nextInt();

            result = add(num1, num2);
            System.out.println(result);
            result = sub(num1, num2);
            System.out.println(result);
            result = mul(num1, num2);
            System.out.println(result);
            result = div(num1, num2);
            System.out.println(result);
            result = mod(num1, num2);
            System.out.println(result);

        }catch (InputMismatchException e) {
            System.err.println("Η εισοδος πρεπει να ειναι ακεραιοι.");

        }catch (Exception e) {
            System.err.println("Λαθος κατα τον υπολογισμο, Δεν μπορει να γινει διαιρεση με το μηδεν.");
        }





    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) throws Exception {
        try {
            if (b == 0) throw new Exception("Error. Denominator must not be zero.");
            return a / b;
        }catch (Exception e) {
            System.err.println("Error" + e.getMessage());
            throw e;
        }

    }

    public static int mod(int a, int b) throws Exception {
        try {
            if (b == 0) throw new Exception("Error. Denominator must not be zero.");
            return a % b;
        }catch (Exception e) {
            System.err.println("Error" + e.getMessage());
            throw e;
        }

    }

//    public static int inputNum(int a, int b) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Give nominator");
//        a = in.nextInt();
//        System.out.println("Give denominator");
//        b = in.nextInt();
//
//        return inputNum(a,b);
//    }
}
