import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Employee> employees1 = new ArrayList<>();
        ArrayList<SaleStaff> saleStaffs = new ArrayList<>();
        ArrayList<SaleStaff> saleStaffs1 = new ArrayList<>();
        ArrayList<Technician> technicians = new ArrayList<>();
        ArrayList<Technician> technicians1 = new ArrayList<>();
        ArrayList<Manager> managers = new ArrayList<>();

        employees.add(new Employee("hehe", "vc",222));
        employees.add(new Employee("hehe1", "vc",222));
        employees.add(new Employee("hehe2", "vc",222));

        saleStaffs.add(new SaleStaff("hoho", "vl", 234, 4));
        saleStaffs.add(new SaleStaff("hoho1", "vl", 234, 4));
        saleStaffs.add(new SaleStaff("hoho2", "vl", 234, 4));

        saleStaffs1.add(new SaleStaff("hoho3", "vl", 234, 4));
        saleStaffs1.add(new SaleStaff("hoho4", "vl", 234, 4));
        saleStaffs1.add(new SaleStaff("hoho5", "vl", 234, 4));

        technicians.add(new Technician("haha", "vcl", 23, "ngon"));
        technicians.add(new Technician("haha1", "vcl", 23, "ngon"));
        technicians.add(new Technician("haha2", "vcl", 23, "ngon"));

        technicians1.add(new Technician("haha3", "vcl", 23, "ngon"));
        technicians1.add(new Technician("haha4", "vcl", 23, "ngon"));
        technicians1.add(new Technician("haha5", "vcl", 23, "ngon"));

        managers.add(new Manager("wow", "dm", 123213, saleStaffs, technicians));
        managers.add(new Manager("wow", "dm", 123213, saleStaffs1, technicians1));

        managers.get(0).getSaleStaffById(0);
    }
}