package com.appsDeveloperBlog.estore.service;

import com.appsDeveloperBlog.estore.data.UsersRepository;
import com.appsDeveloperBlog.estore.model.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @InjectMocks
    static UserServiceImpl userService;

    @Mock
    UsersRepository usersRepository;   // mockito will automatically create a mock obj that
                                        // implements the UsersRepository interface

    @Mock
    EmailVerificationServiceImpl emailVerificationService;

    static String firstName;
    static String lastName;
    static String email;
    static String password;
    static String repeatPassword;

    @BeforeEach
    public void init() {
//        userService = new UserServiceImpl();   // no longer need to create manually
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
//        Mockito.when(usersRepository.save(Mockito.any(User.class))).thenReturn(false);
        Mockito.when(usersRepository.save(any(User.class))).thenReturn(true);

        // Act
        User user = userService.createUser(firstName, lastName, email, password, repeatPassword);
        // Assert
        assertNotNull(user, "create user method should not return null");
        assertEquals(firstName, user.getFirstName(), "firstName incorrect");
        assertEquals(lastName, user.getLastName(), "lastName incorrect");
        assertEquals(email, user.getEmailId(), "email incorrect");
        assertNotNull(user.getId(), "user id is missing");
        Mockito.verify(usersRepository, times(1))
                .save(any(User.class));

        // Mockito.verify(mockObject, Mockito.atLeast(n)).methodCall();
//        Mockito.verify(mockObject, Mockito.atMost(n)).methodCall();
//        Mockito.verify(mockObject, Mockito.never(n)).methodCall();
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

    @DisplayName("If save() method causes RuntimeException, a userServiceException is thrown")
    @Test
    void testCreatUser_whenSavedMethodThrowsException_thenThrowsUserServiceException() {
        // Arrange
        when(usersRepository.save(any(User.class))).thenThrow(RuntimeException.class);

        // Act & Assert
        assertThrows(UserServiceException.class, () -> {
            userService.createUser(firstName, lastName, email, password, repeatPassword);
        }, "Should have thrown UserServiceException instead");

        // Assert
    }

    @Test
    @DisplayName("Email notification Exception is handled")
    void testCreateUser_whenEmailNotificationExceptionThrown_thenThrowsUserServiceException() {

        // Arrange
        when(usersRepository.save(any(User.class))).thenReturn(true);
//        when(emailVerificationService.scheduleEmailConfirmation(any(User.class))).thenThrow();    // won't compile since method is void

        doThrow(EmailVerificationServiceException.class).when(emailVerificationService)
                .scheduleEmailConfirmation(any(User.class));

        // Act & Assert
        assertThrows(UserServiceException.class, () -> {
            userService.createUser(firstName, lastName, email, password, repeatPassword);
        }, "Should have thrown EmailVerificationServiceException instead");

        // Assert
        verify(emailVerificationService, times(1)).scheduleEmailConfirmation(any(User.class));
    }
}
