package gr.aueb.cf.ch7;

/*
* Compares 2 Str for less than (lt) , greater than (gt), equal (eq)
* */
public class StrCompareToApp {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "ATHENS";

        if (s1.compareTo(s2) > 0) {
            System.out.println("s1 > s2");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("s1 < s2");
        } else { //if (s1.comparedTo(s2) == 0)
            System.out.println("s1.equals(s2) == true");
        }

        if (s1.compareToIgnoreCase(s2) > 0) {
            System.out.println("s1 > s2");
        } else if (s1.compareToIgnoreCase(s2) < 0) {
            System.out.println("s1 < s2");
        } else { //if (s1.comparedToIgnoreCase(s2) == 0)
            System.out.println("s1.equals(s2) == true");
        }

    }
}
