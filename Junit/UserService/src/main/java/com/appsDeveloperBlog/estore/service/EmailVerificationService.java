package com.appsDeveloperBlog.estore.service;

import com.appsDeveloperBlog.estore.model.User;

public interface EmailVerificationService {

    void scheduleEmailConfirmation(User user);
}
