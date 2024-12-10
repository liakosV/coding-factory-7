package gr.aueb.cf.ch5;

public class EvenOddApp {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num + " is Even: " + isEven(num));
        System.out.println(num + " is Odd: " + isOdd(num));
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        //return num % 2 != 0;
        return !isEven(num);
    }
}
