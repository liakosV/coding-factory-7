package gr.aueb.cf.ch7;


/*
* Τα Str ειναι  immutable και δεν
* επηρεαζει το αντιγραφο της αναφορας.
* Οποτε εχοθμε εγκυρο copy με αντιγραφη
* της αναφορας.
*/
public class StrCopy {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = s1;
    }
}
