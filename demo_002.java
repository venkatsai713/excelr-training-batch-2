import java.util.Scanner;

public class demo_002 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("The greatest number is: " + num1);
        } else {
            System.out.println("The greatest number is: " + num2);
        }

        scanner.close();
    }
}
