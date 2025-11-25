package Bai1.service;

import Bai1.constant.ErrorMessage;
import Bai1.constant.Message;
import Bai1.constant.SuccessMessage;
import Bai1.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public static ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public boolean addStudent(Student student) {
        students.add(student);
        return true;
    }

    public void editStudent(Student student, String name, int age, String _class) {
        boolean check = false;
        for (Student s : students) {
            if (s.equals(student)) {
                int getIdx = students.indexOf(s);
                student = new Student(name, age, _class);
                students.add(getIdx, student);
                check = true;
            }
        }
        if (check) System.out.println(SuccessMessage.EDITED_SUCCESSFULLY);
        else System.out.println(ErrorMessage.INVALID_STUDENT);
    }

    public void removeStudent(Student student) {
        while (true) {
            System.out.print(Message.CONFIRM_REMOVING_MESSAGE);
            String choose = sc.nextLine();
            if (choose.equalsIgnoreCase("y")) {
                students.remove(student);
                System.out.println(SuccessMessage.REMOVED_SUCCESSFULLY);
            } else if (choose.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println(ErrorMessage.INVALID_CHOOSE);
            }
        }
    }


}
