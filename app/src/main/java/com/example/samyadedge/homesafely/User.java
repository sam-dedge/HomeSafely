package com.example.samyadedge.homesafely;

public class User {
    String name;
    String email;
    String userID;

    public User(){

    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
