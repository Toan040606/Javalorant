public class Technician extends Employee{
    private String techSkill;

    public Technician(String name, String country, double salary, String techSkill) {
        super(name, country, salary);
        this.techSkill = techSkill;
    }

    public Technician(String name, String country, double salary) {
        super(name, country, salary);
    }

    public String getTechSkill() {
        return techSkill;
    }

    public void setTechSkill(String techSkill) {
        this.techSkill = techSkill;
    }
}
