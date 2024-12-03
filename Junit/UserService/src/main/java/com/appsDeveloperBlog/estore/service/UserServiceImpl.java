package com.appsDeveloperBlog.estore.service;

import com.appsDeveloperBlog.estore.data.UsersRepository;
import com.appsDeveloperBlog.estore.data.UsersRepositoryImpl;
import com.appsDeveloperBlog.estore.model.User;

public class UserServiceImpl implements UserService {

    UsersRepository usersRepository;

    public UserServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public User createUser(String firstName, String lastName, String email, String password, String repeatPassword) {

        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("firstName cannot be null or empty");
        }

        User user =  new User(firstName, lastName, email);
//        UsersRepository usersRepository = new UsersRepositoryImpl();
        boolean isUserCreated = usersRepository.save(user);

        if (!isUserCreated) {
            throw new UserServiceException("Could not creat user");
        }

        return user;
    }
}
