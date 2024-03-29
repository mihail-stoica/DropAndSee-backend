package com.mihailstoica.dropandsee;

import com.mihailstoica.dropandsee.entity.User;

public class TestUtil {

    public static User createValidUser() {
        User user = new User();
        user.setUserName("test-user");
        user.setDisplayName("test-display");
        user.setPassword("P4ssword");
        return user;
    }

    public static User createValidUser(String username) {
        User user = createValidUser();
        user.setUserName(username);
        return user;
    }
}
