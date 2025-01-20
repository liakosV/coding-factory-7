package gr.aueb.cf.ch16.default_static;

public class CodingWelcome implements IWelcome {

    public static void staticMethod() {
        System.out.println("Static method from codingWelcome hides IWelcome");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in codingWelcome");
        IWelcome.super.defaultMethod();
    }
}
