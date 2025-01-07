/*1. Create a class Employee implement the following:

a) Instance variables

• id

• firstName

• lastName

address

b) Generate Constructors (default & parameterised)

c) Implement the getFullName(), which returns the firstName concatinated with lastName.*/

package problemstatement;

public class ps_001 {

    int id;
    String firstName;
    String lastName;
    String address;

    public ps_001() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.address = "";
    }

    public ps_001(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public static void main(String[] args) {
        ps_001 employee = new ps_001(1, "Venkat", "Sai", "Siddipet");

        System.out.println("Full Name: " + employee.getFullName());
    }
}