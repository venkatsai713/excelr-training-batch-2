import java.util.Scanner;

public class demo_008 {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        String correctLoginId = "Sai";
        String correctPassword = "713";
        String reply;
        boolean isValidCustomer = false;

        do {
            System.out.println("Welcome to Malla Reddy University");
            System.out.println("Have You visited Our Site Earlier? (Yes/No)");
            reply = S1.nextLine();

            if (reply.equalsIgnoreCase("No")) {
                System.out.println("Login Here");
                System.out.println("Enter your Id:");
                String loginId = S1.nextLine();
                System.out.println("Enter your Password:");
                String password = S1.nextLine();

                if (loginId.equals(correctLoginId) && password.equals(correctPassword)) {
                    System.out.println("Login Successful!");
                    isValidCustomer = true;
                } else {
                    System.out.println("Invalid Login Id or Password. Please try again.");
                }
            } else if (reply.equalsIgnoreCase("Yes")) {
                System.out.println("You are Our Valid Customer");
                isValidCustomer = true;
            } else {
                System.out.println("Invalid input. Please enter 'Yes' or 'No'.");
            }
        } while (!isValidCustomer);

        S1.close();
    }
}