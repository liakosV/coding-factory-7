package gr.aueb.cf.ch6;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 8, 9};
        int low = 0;
        int high = arr.length - 1;
        int position = -1;
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("dwse value: ");
//        int value = in.nextInt();
//
//        position = binarySearch(arr, value, low, high);

        position = binarySearch(arr, 7, low, high);

        if (position == -1) {
            System.out.println("Value was not found");
        } else {
            System.out.println("Value was found in position: " + (position + 1));
        }
    }


    /**
     *
     * @param arr
     * @param value
     * @param low
     * @param high
     * @return
     */
    public static int binarySearch(int[] arr, int value, int low, int high) {
        if (arr == null) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == value) return mid;
        if (value > arr[mid]) {
            return binarySearch(arr, value, mid +1, high);
        } else  {       //if (value < arr[mid])
            return binarySearch(arr, value, low, mid-1);
        }
    }
}
