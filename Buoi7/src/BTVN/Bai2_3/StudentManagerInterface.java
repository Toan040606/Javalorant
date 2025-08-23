package BTVN.Bai2_3;

public interface StudentManagerInterface {
    void sortByScoreDesc();
    void sortByScoreAsc();
    Student findByName(String name);
    void printStudents();
}
