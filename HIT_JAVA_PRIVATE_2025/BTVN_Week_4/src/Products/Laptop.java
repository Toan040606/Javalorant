package Products;

public class Laptop extends Product{
    private String ram;
    private String cpu;

    public Laptop(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    public Laptop(String name, String description, double price, String ram, String cpu) {
        super(name, description, price);
        this.ram = ram;
        this.cpu = cpu;
    }

    public Laptop() {

    }

    @Override
    public void getInfo() {
        System.out.println("Products.Product{" +
                            "id=" + getId() +
                            ", name='" + getName() + '\'' +
                            ", description='" + getDescription() + '\'' +
                            ", price=" + getPrice() +
                            ", Products.Laptop{ram='" + ram + '\'' +
                            ", cpu='" + cpu + '\'' +
                            "}}");
    }
}
