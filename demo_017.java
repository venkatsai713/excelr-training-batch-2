import java.util.Scanner; 

public class demo_017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt(); 

        printFibonacci(n);

        scanner.close(); 
    }

    public static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int prev1 = 0, prev2 = 1;

        System.out.print(prev1 + " ");

        if (n > 1) {
            System.out.print(prev2 + " ");
        }

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2; 
            System.out.print(curr + " "); 
            prev1 = prev2; 
            prev2 = curr;
        }
    }
}