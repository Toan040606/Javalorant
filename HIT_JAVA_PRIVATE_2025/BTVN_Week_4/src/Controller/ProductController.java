package Controller;

import Products.Laptop;
import Products.Product;
import Products.SmartPhone;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    Scanner sc = new Scanner(System.in);
    public static ArrayList<Product> products = new ArrayList<>();
    public static ArrayList<String> availableTypes = new ArrayList<>();

    public void getAllType() {
        System.out.println("All available type: ");
        for (String t : availableTypes) {
            System.out.println(t);
        }
        System.out.println();
    }

    public void getAllProducts() {
        for (Product p : products) {
            p.getInfo();
        }
    }

    public boolean removeById(int id) {
        String chooseWisely;
        System.out.print("ARE YOU SURE YOU WANT TO REMOVE THIS PRODUCT? (Y/N) "); chooseWisely = sc.nextLine();
        if (chooseWisely.equalsIgnoreCase("y")) {
            for (Product p : products) {
                if (p.getId() == id) {
                    products.remove(p);
                    return true;
                }
            }
        }
        return false;
    }

    public void getById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.getInfo();
            }
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean addProduct(String type, String name, String description, double price) {
        if (type.equalsIgnoreCase("smartphone")) {
            System.out.print("Is it 5G already? (true/false) "); boolean has5g = sc.nextBoolean(); sc.nextLine();
            products.add(new SmartPhone(name, description, price, has5g));
            return true;
        } else if(type.equalsIgnoreCase("laptop")) {
            System.out.print("How much RAM does it have? "); String ram = sc.nextLine();
            System.out.print("What kind of processor does it have? "); String cpu = sc.nextLine();
            products.add(new Laptop(name, description, price, ram, cpu));
            return true;
        } return false;
    }
}
