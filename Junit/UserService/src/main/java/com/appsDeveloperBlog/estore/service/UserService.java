package com.appsDeveloperBlog.estore.service;

import com.appsDeveloperBlog.estore.model.User;

public interface UserService {

//    void createUser();

    User createUser(String firstName, String lastName, String email, String password, String repeatPassword);
}
