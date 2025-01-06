package gr.aueb.cf.ch12;

/*
* Data Class.
* POJO (Plain Old Java Object)
* java bean
* */

public class Student {
    private static int studentCount;

    private int id;
    private String firstname;
    private String lastname;

    static {
        studentCount = 0;
    }


    //Default Constructor
    public Student() {
        studentCount++;
    }

    //Overloaded Constructor
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentCount++;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
