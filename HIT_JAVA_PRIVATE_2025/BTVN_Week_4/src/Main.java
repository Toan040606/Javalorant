import Controller.ProductController;
import Products.Laptop;
import Products.Product;
import Products.SmartPhone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductController productController = new ProductController();

        ProductController.availableTypes.add("Laptop");
        ProductController.availableTypes.add("SmartPhone");
        ProductController.products.add(new Product("Fan", "Cool", 324));
        ProductController.products.add(new Product("Television", "Watch P", 355));
        ProductController.products.add(new Product("Keyboard", "Type P", 31));
        ProductController.products.add(new SmartPhone("Apple", "Watch P", 2341, true));
        ProductController.products.add(new Laptop("DELL", "Watch P", 2131, "128GB", "Intel Core i12-999999K"));

        while (true) {
            System.out.println();
            System.out.println("--- Product Controller Menu --- ");
            System.out.println("1. Add product");
            System.out.println("2. Get product by id");
            System.out.println("3. Remove product by id");
            System.out.println("4. Get all products");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choose = sc.nextInt(); sc.nextLine();
            int id;
            System.out.println();
            switch (choose) {
                case 1:
                    boolean running = true;
                    while (running) {
                        System.out.println("--- Add Product Menu--- ");
                        System.out.println("1. Normal add");
                        System.out.println("2. Add with type");
                        System.out.println("3. Exit");
                        System.out.print("Choose: ");
                        int choose1 = sc.nextInt(); sc.nextLine();
                        String name, desc, type;
                        double price;
                        switch (choose1) {
                            case 1:
                                System.out.println();
                                System.out.print("Product name: "); name = sc.nextLine();
                                System.out.print("Product description: "); desc = sc.nextLine();
                                System.out.print("Product price: "); price = sc.nextDouble(); sc.nextLine();
                                Product product = new Product(name, desc, price);
                                productController.addProduct(product);
                                System.out.println();
                                System.out.println("Added");
                                System.out.println();
                                break;
                            case 2:
                                System.out.println();
                                productController.getAllType();
                                System.out.print("Product type: "); type = sc.nextLine();
                                System.out.print("Product name: "); name = sc.nextLine();
                                System.out.print("Product description: "); desc = sc.nextLine();
                                System.out.print("Product price: "); price = sc.nextDouble();sc.nextLine();
                                if (productController.addProduct(type, name, desc, price)){
                                    System.out.println();
                                    System.out.println("Added");
                                    System.out.println();
                                } else {
                                    System.out.println();
                                    System.out.println("INVALID TYPE!");
                                    System.out.println();
                                }
                                break;
                            case 3:
                                running = false;
                                break;
                            default:
                                System.out.println("INVALID CHOOSE!!");
                        }
                    }
                    break;
                case 2:
                    System.out.print("Product ID: "); id = sc.nextInt();
                    productController.getById(id);
                    break;
                case 3:
                    System.out.print("Product ID: "); id = sc.nextInt();
                    if (productController.removeById(id)) {
                        System.out.println("REMOVED");
                    }
                    break;
                case 4:
                    System.out.println("All products: ");
                    productController.getAllProducts();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("INVALID CHOOSE!!");
            }

        }
    }
}
