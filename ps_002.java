/*2. Create a class PartTimeEmployee which is extending from Employee class and implement the following:

a) Instance variables

• hours Worked

amountPerHour

b) Generate Constructors (default & parameterised)

c) Create a method (computeSal()) to calculate the salary based on working hours

d) Create a method showDetails() to display the details of PartTimeEmployee */

package problemstatement;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class ps_002 extends Employee {
    private int hoursWorked;
    private double amountPerHour;

    public ps_002() {
        super(); 
        this.hoursWorked = 0;
        this.amountPerHour = 0.0;
    }

    public ps_002(String name, int id, int hoursWorked, double amountPerHour) {
        super(name, id); 
        this.hoursWorked = hoursWorked;
        this.amountPerHour = amountPerHour;
    }

    public double computeSal() {
        return hoursWorked * amountPerHour;
    }

    public void showDetails() {
        System.out.println("Part-Time Employee Details:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Amount Per Hour: " + amountPerHour);
        System.out.println("Salary: " + computeSal());
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getAmountPerHour() {
        return amountPerHour;
    }

    public void setAmountPerHour(double amountPerHour) {
        this.amountPerHour = amountPerHour;
    }

    public static void main(String[] args) {
        ps_002 emp = new ps_002("Venkat Sai", 713, 20, 14);

        emp.showDetails();
    }
}