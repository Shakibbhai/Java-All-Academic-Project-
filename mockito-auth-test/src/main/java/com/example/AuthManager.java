package com.example;

public class AuthManager {
    private final UserRepository userRepository;

    public AuthManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean login(String email, String password) throws Exception {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format");
        }

        User user = userRepository.findByEmail(email);
        String hashedInput = hashPassword(password);
        return user.getPassword().equals(hashedInput);
    }

    private String hashPassword(String password) {
        // Simple hash (for demo purposes only)
        return Integer.toHexString(password.hashCode());
    }

    private boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }
}
