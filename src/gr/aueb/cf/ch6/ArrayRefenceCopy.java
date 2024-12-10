package gr.aueb.cf.ch6;


/*
* Copies the refence of the array.
* it is shallow copy. there are side
* effects.
 */
public class ArrayRefenceCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrRefCopy = arr;

        for (int el : arrRefCopy) {
            System.out.printf(el + " ");
        }

        arrRefCopy[4] = 100;
        System.out.println();
        for (int el : arr) {
            System.out.print(el + " ");
        }

    }
}
