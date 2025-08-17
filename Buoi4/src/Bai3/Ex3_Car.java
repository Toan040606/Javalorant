package Bai3;

public class Ex3_Car {
    private String brand;
    private int speed;

    public Ex3_Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void run() {
        System.out.println("Xe " + brand + " đang chạy với tốc độ tối đa " + speed + " km/h");
    }
}
