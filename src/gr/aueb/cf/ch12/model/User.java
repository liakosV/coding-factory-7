package gr.aueb.cf.ch12.model;

public class User {
    private int id;
    private String firstname;
    private  String lastname;
    private  String username;
    private Boolean isActive;

    public User() {

    }

    public User(int id, String firstname, String lastname, String password, Boolean isActive) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = password;
        this.isActive = isActive;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
