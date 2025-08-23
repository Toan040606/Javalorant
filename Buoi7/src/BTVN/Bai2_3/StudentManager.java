package BTVN.Bai2_3;

import java.util.ArrayList;

public class StudentManager implements StudentManagerInterface{
    private ArrayList<Student> students;

    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    public StudentManager() {

    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public void sortByScoreDesc() {
        ArrayList<Student> scoreDescStudents = this.students;
        for (int i=0; i<scoreDescStudents.size(); i++) {
            for (int j=0; j<scoreDescStudents.size();j++) {
                if (scoreDescStudents.get(i).getScore() >= scoreDescStudents.get(j).getScore()) {
                    Student temp = scoreDescStudents.get(i);
                    scoreDescStudents.set(i, scoreDescStudents.get(j));
                    scoreDescStudents.set(j, temp);
                }
            }
        }

        System.out.printf("%-10s%-10s%-10s%-20s%-10s%-10s%-10s%-10s",
            "ID", "Name", "Age", "Email", "Class", "Address", "Score", "Grade");
        System.out.println();
        for (Student s : scoreDescStudents) {
            System.out.printf("%-10s%-10s%-10d%-20s%-10s%-10s%-10.1f%-10s",
                    s.getId(), s.getName(), s.getAge(), s.getEmail(), s.getClassName(), s.getAddress(), s.getScore(), s.getGrade());
            System.out.println();
        }
    }

    @Override
    public void sortByScoreAsc() {
        ArrayList<Student> scoreAscStudents = this.students;
        for (int i=0; i<scoreAscStudents.size(); i++) {
            for (int j=0; j<scoreAscStudents.size();j++) {
                if (scoreAscStudents.get(i).getScore() <= scoreAscStudents.get(j).getScore()) {
                    Student temp = scoreAscStudents.get(i);
                    scoreAscStudents.set(i, scoreAscStudents.get(j));
                    scoreAscStudents.set(j, temp);
                }
            }
        }

        System.out.printf("%-10s%-10s%-10s%-20s%-10s%-10s%-10s%-10s",
                "ID", "Name", "Age", "Email", "Class", "Address", "Score", "Grade");
        System.out.println();
        for (Student s : scoreAscStudents) {
            System.out.printf("%-10s%-10s%-10d%-20s%-10s%-10s%-10.1f%-10s",
                    s.getId(), s.getName(), s.getAge(), s.getEmail(), s.getClassName(), s.getAddress(), s.getScore(), s.getGrade());
            System.out.println();
        }
    }

    @Override
    public Student findByName(String name) {
        for (Student s : this.students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.printf("%-10s%-10s%-10s%-20s%-10s%-10s%-10s%-10s",
                        "ID", "Name", "Age", "Email", "Class", "Address", "Score", "Grade");
                System.out.println();
                System.out.printf("%-10s%-10s%-10d%-20s%-10s%-10s%-10.1f%-10s",
                    s.getId(), s.getName(), s.getAge(), s.getEmail(), s.getClassName(), s.getAddress(), s.getScore(), s.getGrade());
                System.out.println();
                return s;
            }
        }
        System.out.println("Không tim thấy tên học sinh này trong danh sách.");
        return null;
    }

    @Override
    public void printStudents() {
        System.out.printf("%-10s%-10s%-10s%-20s%-10s%-10s%-10s%-10s",
                "ID", "Name", "Age", "Email", "Class", "Address", "Score", "Grade");
        System.out.println();
        for (Student s : this.students) {
            System.out.printf("%-10s%-10s%-10d%-20s%-10s%-10s%-10.1f%-10s",
                    s.getId(), s.getName(), s.getAge(), s.getEmail(), s.getClassName(), s.getAddress(), s.getScore(), s.getGrade());
            System.out.println();
        }
    }
}
