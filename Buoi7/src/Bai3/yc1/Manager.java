package Bai3.yc1;

public class Manager extends Employee{
    private final double phuCapQL;

    public Manager(double phuCapQL) {
        this.phuCapQL = phuCapQL;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.phuCapQL;
    }
}
