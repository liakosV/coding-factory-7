package gr.aueb.cf.ch10;

public class ArrayAdd {

    public static void main(String[] args) {
        int[] arr = {9, 9, 9, 8};
        int [] arr2 = {1, 0, 0, 0};
        int[] arrOut;
        int[] arrOut2;

        arrOut = addOne(arr);

        for (int digit : arrOut) {
            System.out.print(digit + " ");
        }

        System.out.println();
        try {
            arrOut2 = addArray(arr2);

            for (int array : arrOut2) {
                System.out.print(array + " ");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public static int[] addOne(int[] arr) {
        int[] arrOut;
        int currentSum;
        int carry = 1;

        if (arr == null) throw new IllegalArgumentException("Error. Array must not be null.");
        arrOut = new int[arr.length + 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            currentSum = arr[i] + carry;

            arrOut[i + 1] = currentSum % 10;
            carry = currentSum / 10;
        }

        arrOut[0] = carry;        //(carry == 1) ? 1 : 0;
        return arrOut;
    }

    public static int[] addArray(int[] arr) {
        int[] arrOut;
        int currentSum;
        int[] carry = {1, 0, 0, 0} ;
        int carry2 = 0;

        if (arr == null) throw new IllegalArgumentException("Error. Array must not be null.");
        arrOut = new int[arr.length + 1];
        carry = new int [arr.length + 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            currentSum = arr[i] + carry[i];

            arrOut[i + 1] = currentSum % 10;
            carry[i + 1] = currentSum % 10;
            carry2 = currentSum / 10;
        }

        arrOut[0] = carry[arr.length];        //(carry == 1) ? 1 : 0;
        carry[0] = carry2;
        return carry;
    }
}
