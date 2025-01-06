package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.*;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Athanasios", "Androutsos");
        User user = new User(1, "Costas", "Mask", "cmask", true);
        User user2 = new User(2, "", "", "", true);
        Customer customer = new Customer(1, "Andrew", "Dimitriou", "012345678", "6969696969", "West Atiica",
                                "Attica", "Athens", "Patision", "76","10434");
        Point point = new Point(0, 10);
        Order order = new Order(1, 5.5, "Meat", "Ordered");

        System.out.println("Teacher full name: " + teacher.getFirstname() + ", " + teacher.getLastname());
        System.out.println("User username: " + user.getUsername());
        System.out.println("Customer Vat: " + customer.getVatRegistrationNo());
        System.out.println("Order Timestamp " + order.getFormatedTimestamp());
        System.out.printf("Point: {%d, %d}\n" , point.getX(), point.getY());
    }
}
