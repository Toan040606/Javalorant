package BTVN.Bai1;

import java.util.Scanner;

public class Faculty {
    private String name;
    private String date;
    private School x;

    public Faculty(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên trường: "); String schoolName = sc.nextLine();
        System.out.print("Nhập ngày vào trường: "); String schoolDate = sc.nextLine();
        this.x = new School(schoolName, schoolDate);
    }

    public void output() {
        System.out.println(this.x);
    }

    @Override
    public String toString() {
        return ", Tên khoa: " + name +
                ", Ngày vào khoa: " + date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }
}
