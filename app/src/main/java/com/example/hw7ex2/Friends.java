package com.example.hw7ex2;

public class Friends {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Friends(int newId, String newFName, String newLName, String newEmail) {
        setID(newId);
        setFName(newFName);
        setLName(newLName);
        setEmail(newEmail);
    }

    public Friends(int newId, String string, double aDouble) {
    }

    private void setID(int newId) {
        id = newId;
    }

    private void setFName(String newFName) {
        firstName = newFName;
    }

    private void setLName(String newLName) {
        lastName = newLName;
    }

    private void setEmail(String newEmail) {
            email = newEmail;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return firstName + lastName;
    }

    public String getEmail() {
        return email;
    }

    public String toString(){
        return firstName + "; " + lastName + "; " + email;
    }
}
