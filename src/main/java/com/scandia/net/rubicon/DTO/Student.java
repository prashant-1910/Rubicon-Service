package com.scandia.net.rubicon.DTO;

public class Student {
    private Long id;
    private String userName;
    private String firstName;
    private String lastName;
    private String address;

    public Student() {}

    public Student(Long id, String name, String firstName, String lastName, String address) {
        this.id = id;
        this.userName = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
