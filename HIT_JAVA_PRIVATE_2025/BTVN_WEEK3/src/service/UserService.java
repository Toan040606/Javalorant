package service;

import model.User;

import java.util.ArrayList;

public class UserService {
    public static void getUserById(ArrayList<User> users, String userId) {
        boolean found = false;
        for (User x : users) {
            if (x.getId().equals(userId)) {
                System.out.println(x);
                found = true;
                break;
            }
        }

        if (!found) System.out.println("INVALID USER!");
    }

    public static void getAllUser(ArrayList<User> users) {
        for (User x : users) {
            System.out.println(x);
        }
    }
}
