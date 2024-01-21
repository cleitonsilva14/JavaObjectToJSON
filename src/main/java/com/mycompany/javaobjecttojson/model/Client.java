package com.mycompany.javaobjecttojson.model;

import java.util.UUID;

public class Client {
    private UUID UUID;
    private String firstName;
    private String lastName;
    private String email;

    public Client(String firstName, String lastName, String email) {
        this.UUID = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public UUID getUUID(){
        return this.UUID;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" + "UUID=" + UUID + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + '}';
    }
}
