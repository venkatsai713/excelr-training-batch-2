import java.util.Scanner;

public class ps_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = ((number + 50) / 100) * 100;

        System.out.println("The nearest multiple of 100 is: " + result);

        scanner.close();
    }
}