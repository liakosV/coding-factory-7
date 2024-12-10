package gr.aueb.cf.ch2;

/*
* */
public class FrogJumpsApp {
    public static void main(String[] args) {
        int start = 10;
        int jumps = 0;
        int target = 85;
        int hop = 30;

        jumps = (int) Math.ceil((target - start) / (double) hop);

        System.out.println(jumps);
    }
}
