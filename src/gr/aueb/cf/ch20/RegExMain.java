package gr.aueb.cf.ch20;

public class RegExMain {

    public static void main(String[] args) {
        String s = "Athana Androutsos";
//        String d = "10/2/2025";
//        String g = "Green";
//        String d = "Developing";

//        System.out.println(isRed(s));
//        System.out.println(isRedOrGreen(g));
//        System.out.println(isrRedOrgGreen(g));
//        System.out.println(beginsWithOneUpperCaseAndEndInIng(d));
//        System.out.println(anySymbolDigit(s));
//        System.out.println(isEmail(s));
//        System.out.println(isDate(d));

//        String[] tokens = doSplit(s);
//        for (String token : tokens) {
//            System.out.print(token + " ");
//        }

//        System.out.println(doReplace(s));
        System.out.println(doReplaceBackReference(s));
    }

    /**
     * Ελεγχει (matches) αν το input string
     * ειναι το "red".
     * (Η matches δεν εχει ignoreCase.)
     * @param s
     * @return
     */
    public static boolean isRed(String s) {
        return s.matches("red");
    }

    /**
     * Ελεγχει (matches) αν το input string ειναι
     * red ή green.
     * @param s
     * @return
     */
    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }

    /**
     * Ελεγχει (matches) αν το input string ειναι
     * "red" or "Red" ή "green" or "Green"
     * @param s
     * @return
     */
    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed|[gG]reen");
    }

    public static boolean beginsWithOneUpperCaseAndEndInIng(String s) {
        return s.matches("[A-Z]ing");
    }

    public static boolean isOneLetterEndInIng(String s) {
        return s.matches("[A-Za-z]ing");
    }

    public static boolean whitespaceDigit(String s) {
        return s.matches("\\s\\d$");
    }

    public static boolean anySymbolDigit(String s) {
//        return s.matches(".\\d");
        return s.matches(".[0-9]");
    }

    public static boolean isEmail(String s) {
        return s.matches("\\w*\\.?\\w+@\\w+\\.[a-z]{2,4}");
    }

    public static boolean isDate(String s) {
        return s.matches("\\d{1,2}/\\d{1,2}/\\d{4}");
    }

    public static String[] doSplit(String s) {
        return s.split("\\s+");
    }

    public static String doReplace(String s) {
        return s.replaceAll("\\s+", "_");
    }

    public static String doReplaceBackReference(String s) {
        return s.replaceAll("(.+)\\s+(.+)", "$2 $1");
    }


}
