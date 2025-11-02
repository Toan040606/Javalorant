package service;

import model.User;

import java.util.ArrayList;

public class AuthService {
    public static boolean login(ArrayList<User> users, String username, String password) {
        for (User x : users) {
            if (x.getUsername().equals(username)) {
                return x.getPassword().equals(password);
            }
        }
        return false;
    }

    public static void register(ArrayList<User> users, String username, String password, String email, String phoneNumber) {
        users.add(new User(username, password, email, phoneNumber));
    }

    public static boolean changePassword(ArrayList<User> users, String userID, String newPassword, String confirmNewPassword) {
        for (User x : users) {
            if (x.getId().equals(userID)) {
                if (newPassword.equals(confirmNewPassword)) {
                    x.setPassword(newPassword);
                    return true;
                } else {
                    System.out.println("Confirm password does not match");
                    return false;
                }
            }
        }
        System.out.println("INVALID USER!");
        return false;
    }

}
