package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AuthManagerTest {

    private UserRepository mockUserRepository;
    private AuthManager authManager;
    private String email;
    private String rawPassword;
    private String hashedPassword;
    private String invalidEmail;
    private String nonexistentEmail;
    private User testUser;

    @BeforeEach
    void setUp() throws Exception {
        mockUserRepository = mock(UserRepository.class);
        authManager = new AuthManager(mockUserRepository);

        email = "test@example.com";
        rawPassword = "password123";
        hashedPassword = Integer.toHexString(rawPassword.hashCode());
        invalidEmail = "invalid-email";
        nonexistentEmail = "nonexistent@example.com";
        testUser = new User(email, hashedPassword);

        when(mockUserRepository.findByEmail(email)).thenReturn(testUser);
        when(mockUserRepository.findByEmail(nonexistentEmail))
                .thenThrow(new Exception("User not found"));
    }

    @AfterEach
    void tearDown() {
        mockUserRepository = null;
        authManager = null;
        email = null;
        rawPassword = null;
        hashedPassword = null;
        invalidEmail = null;
        nonexistentEmail = null;
        testUser = null;
    }

    @Test
    void testSuccessfulLogin() throws Exception {
        boolean result = authManager.login(email, rawPassword);
        assertTrue(result);
    }

    @Test
    void testLoginWithWrongPassword() throws Exception {
        boolean result = authManager.login(email, "wrongpassword");
        assertFalse(result);
    }

    @Test
    void testLoginThrowsExceptionWhenUserNotFound() throws Exception {
        try {
            authManager.login(nonexistentEmail, "anyPassword");
            fail("Expected Exception was not thrown");
        } catch (Exception e) {
            assertEquals("User not found", e.getMessage());
        }
    }

    @Test
    void testLoginWithInvalidEmail() {
        try {
            authManager.login(invalidEmail, "somePassword");
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid email format", e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception type: " + e);
        }
    }
}
