public class SaleStaff extends Employee{
    private int numberOfSale;

    public SaleStaff(String name, String country, double salary, int numberOfSale) {
        super(name, country, salary);
        this.numberOfSale = numberOfSale;
    }

    public SaleStaff(String name, String country, double salary) {
        super(name, country, salary);
    }

    public int getNumberOfSale() {
        return numberOfSale;
    }

    public void setNumberOfSale(int numberOfSale) {
        this.numberOfSale = numberOfSale;
    }
}
