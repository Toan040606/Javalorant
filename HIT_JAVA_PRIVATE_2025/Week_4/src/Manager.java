import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<SaleStaff> saleStaffs;
    private ArrayList<Technician> technicians;

    public Manager(String name, String country, double salary, ArrayList<SaleStaff> saleStaffs, ArrayList<Technician> technicians) {
        super(name, country, salary);
        this.saleStaffs = saleStaffs;
        this.technicians = technicians;
    }

    public Manager(String name, String country, double salary) {
        super(name, country, salary);
    }


    @Override
    public String toString() {
        return "Manager{" +
                "saleStaffs=" + saleStaffs +
                ", technicians=" + technicians +
                '}';
    }

    public void getSaleStaffById(int saleStaffId) {
        for (SaleStaff s : saleStaffs) {
            if (saleStaffId == s.getId()) {
                System.out.println(s);
            }
        }
    }

    public void getTechnicianById(int technicianId) {
        for (Technician t : technicians) {
            if (technicianId == t.getId()) {
                System.out.println(t);
            }
        }
    }
}
