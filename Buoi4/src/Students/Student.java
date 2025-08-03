package Students;

import java.time.Year;

public class Student {
    private String name;
    private int yearOfBirth;
    private String address;
    private double point1;
    private double point2;
    private double finalPoint;
    private int offSchool;

    public Student(String name, int yearOfBirth, String address, double point1, double point2, double finalPoint, int offSchool) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.point1 = point1;
        this.point2 = point2;
        this.finalPoint = finalPoint;
        this.offSchool = offSchool;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public double getPoint1() {
        return point1;
    }

    public double getPoint2() {
        return point2;
    }

    public double getFinalPoint() {
        return finalPoint;
    }

    public int getOffSchool() {
        return offSchool;
    }

    public double getGPA() {
        return point1*0.2 + point2*0.3 + finalPoint*0.5;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address='" + address + '\'' +
                ", point1=" + point1 +
                ", point2=" + point2 +
                ", finalPoint=" + finalPoint +
                ", offSchool=" + offSchool +
                '}';
    }
}