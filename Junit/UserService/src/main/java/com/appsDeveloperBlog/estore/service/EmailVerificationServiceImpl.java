package com.appsDeveloperBlog.estore.service;

import com.appsDeveloperBlog.estore.model.User;

public class EmailVerificationServiceImpl implements EmailVerificationService {
    @Override
    public void scheduleEmailConfirmation(User user) {

        // Put user details into email queue
        System.out.println("Email verification scheduled ---- method called");
    }
}
