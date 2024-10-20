package com.appsDeveloperBlog.estore.service;

import com.appsDeveloperBlog.estore.model.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    static UserService userService;
    static String firstName;
    static String lastName;
    static String email;
    static String password;
    static String repeatPassword;

    @BeforeAll
    public static void init() {
        userService = new UserServiceImpl();
        firstName = "Saswata";
        lastName = "Mishra";
        email = "sample@email.com";
        password = "password";
        repeatPassword = "repeatPassword";
    }

    @DisplayName("User object created")
    @Test
    void testCreateUser_whenUserDetailsProvided_ReturnsUserObject() {

        // Arrange

        // Act
        User user = userService.createUser(firstName, lastName, email, password, repeatPassword);
        // Assert
        assertNotNull(user, "create user method should not return null");
        assertEquals(firstName, user.getFirstName(), "firstName incorrect");
        assertEquals(lastName, user.getLastName(), "lastName incorrect");
        assertEquals(email, user.getEmailId(), "email incorrect");
        assertNotNull(user.getId(), "user id is missing");
    }

    @DisplayName("Empty first name causes correct exception")
    @Test
    void testCreateUser_whenFirstNameIsEmpty_throwsIllegalArgumentException() {
        // Arrange
        firstName = "";
        String expectedExceptionMessage = "firstName cannot be null or empty";

        // Act & Assert
        IllegalArgumentException exceptionThrown = assertThrows(IllegalArgumentException.class, () -> {
            userService.createUser(firstName, lastName, email, password, repeatPassword);
        }, "Empty firstname should have caused illegal argument exception");

        // Assert
        assertEquals(expectedExceptionMessage, exceptionThrown.getMessage(), "some other exception has been thrown, check manually");
    }
}
