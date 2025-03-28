package gr.aueb.cf.ch6;

public class SymmetricApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 1};

        System.out.println("Array is symmetric: " + isSymmetric(arr));
        System.out.println("Array is symmetric: " + isArraySymmetric(arr));

    }

    public static boolean isSymmetric(int[] arr) {
        boolean isSymmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }

    public static boolean isArraySymmetric(int[] arr) {

        boolean isSymmetric = true;
        int n = arr.length -1;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n-i]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }
}
