import conGetSet_Student.Ex2_Student;

public class Bai2 {
    public static void main(String[] args) {
        Ex2_Student s = new Ex2_Student("Lan", 20);
        System.out.println("Tên: " + s.getName() + ", " + s.getAge() + " tuổi.");
        s.setName("Nam");
        s.setAge(21);
        System.out.println("Tên: " + s.getName() + ", " + s.getAge() + " tuổi.");
    }
}
