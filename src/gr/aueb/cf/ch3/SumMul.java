package gr.aueb.cf.ch3;

/*
*Calculate the sum and mul of
* first 10 integers.
*/

public class SumMul {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int j = 1;
        int mul = 1;

        while (i <=10) {
//            sum = sum + i;
            sum += i;
            i++;
            System.out.println(sum);
        }

        while (j <= 10) {

//            mul *= j++;
            mul = mul * j;
            j++;
            System.out.println(mul);

        }
    }
}
