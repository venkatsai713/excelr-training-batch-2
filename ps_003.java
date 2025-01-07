class Employee {
    private String name;
    private int id;

    public Employee() {
        this.name = "Unknown";
        this.id = 0;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void showDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    private double basic;
    private double bonus;

    public FullTimeEmployee() {
        super();
        this.basic = 0.0;
        this.bonus = 0.0;
    }

    public FullTimeEmployee(String name, int id, double basic, double bonus) {
        super(name, id);
        this.basic = basic;
        this.bonus = bonus;
    }

    public double computeSal() {
        return basic + bonus;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Basic Salary: " + basic);
        System.out.println("Bonus: " + bonus);
        System.out.println("Gross Salary: " + computeSal());
    }
}

public class ps_003 {
    public static void main(String[] args) {
        FullTimeEmployee emp = new FullTimeEmployee("Venkat Sai", 713, 50000.0, 10000.0);
        emp.showDetails();
    }
}