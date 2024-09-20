package com.appsDeveloperBlog.estore.model;

import java.util.concurrent.atomic.AtomicLong;

import static java.lang.Long.valueOf;

public class User {

    private static final AtomicLong ID_GENERATOR = new AtomicLong();

    private String firstName;
    private String lastName;
    private String email;
    private String id;

    public String getId() {
        return id;
    }

    public User(String firstName) {
        this.firstName = firstName;
        this.id = valueOf(ID_GENERATOR.incrementAndGet()).toString();
    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = valueOf(ID_GENERATOR.incrementAndGet()).toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return email;
    }
}
