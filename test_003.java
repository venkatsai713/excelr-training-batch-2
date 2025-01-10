import java.util.Scanner;

public class test_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of participants: ");
        int numberOfParticipants = scanner.nextInt();
        scanner.nextLine();

        boolean allYes = true;

        for (int i = 1; i <= numberOfParticipants; i++) {
            System.out.println("Participant " + i + ", do you say yes? (yes/no): ");
            String reply = scanner.nextLine();
            if (!reply.equalsIgnoreCase("yes")) {
                allYes = false;
            }
        }

        if (allYes) {
            for (int i = 0; i < numberOfParticipants; i++) {
                System.out.println("Happy Sankranthi!");
            }
        } else {
            System.out.println("Not everyone said yes.");
        }

        scanner.close();
    }
}