package Bai2.yc2;

public class Student {
    private String id, name, age;

    public Student(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this.id + ' ' + this.name + ' ' + this.age);
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
