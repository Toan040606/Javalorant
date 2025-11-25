package Bai1.model;

public class Student {
    private String name;
    private int age;
    private String _class;

    public Student(String name, int age, String _class) {
        this.name = name;
        this.age = age;
        this._class = _class;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", _class='" + _class + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }
}
