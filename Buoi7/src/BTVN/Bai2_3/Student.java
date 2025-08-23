package BTVN.Bai2_3;

public class Student {
    private String id, name;
    private double score;
    private int age;
    private String email, className, address;

    public Student(String id, String name, double score, int age, String email, String className, String address) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.age = age;
        this.email = email;
        this.className = className;
        this.address = address;
    }

    public Student() {

    }

    public char getGrade() {
        if (this.score >= 8) return 'A';
        else if (6 <= this.score) return 'B';
        else if (4 <= this.score) return 'C';
        else return 'D';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
