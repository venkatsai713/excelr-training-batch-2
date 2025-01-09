/**
 * Write a Java program to calculate the salary of employees based on their base pay and hours worked.
 * - Ensure the program checks for minimum wage compliance (base pay should be at least $8.00).
 * - Limit the maximum hours worked to 60.
 * - Calculate overtime pay at 1.5 times the base pay for hours worked beyond 40.
 * - Display an error message if the base pay is below minimum wage or hours exceed 60.
 * - Test the program with sample data for multiple employees.
 */

 public class ps_03 {
    private double basePay;
    private int hoursWorked;

    public ps_03() {
        this.basePay = 0.0;
        this.hoursWorked = 0;
    }

    public ps_03(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

    public void computeSalary() {
        if (basePay < 8.00) {
            System.out.println("Error: Base pay is below minimum wage.");
            return;
        }

        if (hoursWorked > 60) {
            System.out.println("Error: Hours worked exceed 60.");
            return;
        }

        double totalPay = 0.0;

        if (hoursWorked <= 40) {
            totalPay = hoursWorked * basePay;
        } else {
            int overtimeHours = hoursWorked - 40;
            totalPay = (40 * basePay) + (overtimeHours * basePay * 1.5);
        }

        System.out.printf("Total pay: $%.2f%n", totalPay);
    }

    public static void main(String[] args) {
        ps_03 employee1 = new ps_03(7.50, 35);
        System.out.print("Employee 1: ");
        employee1.computeSalary();

        ps_03 employee2 = new ps_03(8.20, 47);
        System.out.print("Employee 2: ");
        employee2.computeSalary();

        ps_03 employee3 = new ps_03(10.00, 3);
        System.out.print("Employee 3: ");
        employee3.computeSalary();
    }
}
