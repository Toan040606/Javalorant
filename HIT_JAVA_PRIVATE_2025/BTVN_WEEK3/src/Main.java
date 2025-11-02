import model.User;
import service.AuthService;
import service.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<User> users = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        users.add(new User("anbatocom", "wtf", "hehe@gmail.com", "0123456789"));
        users.add(new User("anbatocom1", "wtf1", "hehe1@gmail.com", "0123456781"));
        users.add(new User("anbatocom2", "wtf2", "hehe2@gmail.com", "0123456782"));
        users.add(new User("anbatocom3", "wtf3", "hehe3@gmail.com", "0123456783"));
        users.add(new User("anbatocom4", "wtf4", "hehe4@gmail.com", "0123456784"));

        String username;
        String password;
        String email;
        String phoneNumber;

        while (true) {
            System.out.println("--- Menu Auth --- ");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int choose = sc.nextInt(); sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.print("Username: "); username = sc.nextLine();
                    System.out.print("Password: "); password = sc.nextLine();
                    boolean check = AuthService.login(users, username, password);
                    if (check) {
                        System.out.println("Login Successfully!");
                        boolean running = true;
                        while (running) {
                            System.out.println("--- Menu User --- ");
                            System.out.println("1. Get user by id");
                            System.out.println("2. Get all users");
                            System.out.println("3. Change password");
                            System.out.println("4. Exit");
                            System.out.print("Choose: ");
                            int choose1 = sc.nextInt(); sc.nextLine();
                            String userId, newPassword, confirmNewPassword;
                            switch (choose1) {
                                case 1:
                                    System.out.print("User ID: "); userId = sc.nextLine();
                                    UserService.getUserById(users, userId);
                                    break;
                                case 2:
                                    UserService.getAllUser(users);
                                    break;
                                case 3:
                                    System.out.print("User ID: "); userId = sc.nextLine();
                                    System.out.print("New password: "); newPassword = sc.nextLine();
                                    System.out.print("Confirm new password: "); confirmNewPassword = sc.nextLine();
                                    boolean check1 = AuthService.changePassword(users, userId, newPassword, confirmNewPassword);
                                    if (check1) {
                                        System.out.println("Change successfully!");
                                    }
                                    break;
                                case 4:
                                    running = false;
                                    break;
                                default:
                                    System.out.println("INVALID CHOOSE!!");
                            }
                        }
                    } else {
                        System.out.println("Wrong username or password, please login again!");
                    }
                    break;
                case 2:
                    System.out.print("Username: "); username = sc.nextLine();
                    System.out.print("Password: "); password = sc.nextLine();
                    System.out.print("Email: "); email = sc.nextLine();
                    System.out.print("Phone number: "); phoneNumber = sc.nextLine();
                    AuthService.register(users, username, password, email, phoneNumber);
                    System.out.println("Register Successfully, please login!");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("INVALID CHOOSE!!");
            }

        }
    }
}