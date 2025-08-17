package BTVN.Bai1;

import java.util.Scanner;

public class Student {
    private String name;
    private String classs;
    private double score;
    private Faculty y;

    public Student(String name, String aClass, double score) {
        this.name = name;
        this.classs = aClass;
        this.score = score;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên khoa: "); String facultyName = sc.nextLine();
        System.out.print("Nhập ngày vào khoa: "); String facultyDate= sc.nextLine();
        this.y = new Faculty(facultyName, facultyDate);
        this.y.input();
    }

    public void output() {
        System.out.print(this.y);
        this.y.output();
    }

    @Override
    public String toString() {
        return "Tên: " + name +
                ", Lớp: " + classs +
                ", Điểm: " + score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }
}
