package Products;

public class SmartPhone extends Product{
    private boolean has5G;

    public SmartPhone() {
    }

    public SmartPhone(boolean has5G) {
        this.has5G = has5G;
    }

    public SmartPhone(String name, String description, double price, boolean has5G) {
        super(name, description, price);
        this.has5G = has5G;
    }

    @Override
    public void getInfo() {
        System.out.println("Products.Product{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", Products.SmartPhone{has5G=" + has5G +
                "}}");
    }
}
