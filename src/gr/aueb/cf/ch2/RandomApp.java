package gr.aueb.cf.ch2;

import java.io.IOException;

public class RandomApp {
    public static void main(String[] args) throws IOException {
        int die = (int) (Math.random() * 1*6);
        System.out.println(die);
        /*
        *auto einai ena diko mou senario
        * na kanw generate enan random arithmo
        * se mia sthlh
        */
        System.out.printf("dwse random tou 10: %f ", + (float) (Math.random() * 1*10));
    }
}
