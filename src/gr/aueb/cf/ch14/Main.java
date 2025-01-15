package gr.aueb.cf.ch14;

import gr.aueb.cf.ch14.model.Point;
import gr.aueb.cf.ch14.model.Teacher;
import gr.aueb.cf.ch14.services.CodingFactoryLazy;
import gr.aueb.cf.ch14.services.CodingFactorySingleton;
import gr.aueb.cf.ch14.services.HelloUtil;

public class Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "Athanasios", "Androutsos");
        Teacher teacher2 = new Teacher(2, "Vasilis", "Liakos");
        Teacher teacher3 = new Teacher(3, "Kwstas", "Lokos");

        HelloUtil.sayHello();

        System.out.println(" to " + teacher1.getFirstname() + " " + teacher1.getLastname());

        Point p1 = Point.getInstance();
        Point p2 = Point.getRandomPoint();

        System.out.println(p1);
        System.out.println(p2);

        CodingFactorySingleton cf1 = CodingFactorySingleton.getInstance();
        CodingFactorySingleton cf2 = CodingFactorySingleton.getInstance();

        System.out.println(cf1);
        System.out.println(cf2);

        CodingFactoryLazy cl1 = CodingFactoryLazy.getInstance();
        CodingFactoryLazy cl2 = CodingFactoryLazy.getInstance();

        System.out.println(cl1);
        System.out.println(cl2);


    }
}
