package Products;

public class Product {
    private static int nextId = 2000;
    private int id;
    private String name;
    private String description;
    private double price;

    public Product() {

    }

    public Product(String name, String description, double price) {
        nextId++;
        this.id = nextId;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getInfo() {
        System.out.println("Products.Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}');
    }
}
