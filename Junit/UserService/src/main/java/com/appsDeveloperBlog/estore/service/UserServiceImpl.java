package com.appsDeveloperBlog.estore.service;

import com.appsDeveloperBlog.estore.model.User;

public class UserServiceImpl implements UserService {


    @Override
    public User createUser(String firstName, String lastName, String email, String password, String repeatPassword) {

        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("firstName cannot be null or empty");
        }

        return new User(firstName, lastName, email);
    }
}
