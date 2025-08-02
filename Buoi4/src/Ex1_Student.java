package Student;

public class Ex1_Student {
    private String name;
    private int age;

    public Ex1_Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Xin chào, tôi tên là " + name + ", năm nay " + age + " tuổi.");
    }
}