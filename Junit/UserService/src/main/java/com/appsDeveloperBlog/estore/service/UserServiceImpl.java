package com.appsDeveloperBlog.estore.service;

import com.appsDeveloperBlog.estore.data.UsersRepository;
import com.appsDeveloperBlog.estore.data.UsersRepositoryImpl;
import com.appsDeveloperBlog.estore.model.User;

public class UserServiceImpl implements UserService {

    UsersRepository usersRepository;

    EmailVerificationService emailVerificationService;

    public UserServiceImpl(UsersRepository usersRepository, EmailVerificationService emailVerificationService) {
        this.usersRepository = usersRepository;
        this.emailVerificationService = emailVerificationService;
    }

    @Override
    public User createUser(String firstName, String lastName, String email, String password, String repeatPassword) {

        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("firstName cannot be null or empty");
        }

        User user =  new User(firstName, lastName, email);
//        UsersRepository usersRepository = new UsersRepositoryImpl();

        boolean isUserCreated;

        try {
            isUserCreated = usersRepository.save(user);

        } catch(RuntimeException rex) {
            throw new UserServiceException(rex.getMessage());
        }

        if (!isUserCreated) {
            throw new UserServiceException("Could not creat user");
        }

//        EmailVerificationService emailVerificationService = new EmailVerificationServiceImpl();
        try {
            emailVerificationService.scheduleEmailConfirmation(user);
        } catch (RuntimeException e) {
            throw new UserServiceException(e.getMessage());
        }
        return user;
    }
}
