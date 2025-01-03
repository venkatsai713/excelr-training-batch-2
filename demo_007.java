import java.util.Scanner;

public class demo_007 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Hello " + name + ", you are " + age + " years old, and your phone number is " + phoneNumber + ".");

        scanner.close();
    }
}