/*PROBLEM STATEMENT
Class Bowler is given to you. Add below details to the class
1.	Instance variables:
name: String
wickets: int
matches: int
balls_bowled: int
runs_conceded: int
2.	Create a default constructor that assigns default values to instance variables.
3.	Create parameterized constructor that accepts name, wickets, matches, balls_bowled, runs_conceded.
4.	Create below methods,
Method name: computeBowlingAverage
Return type: void
This method should print the bowling average of the bowler by dividing runs_conceded with wickets.
Input: 
name = "Sachin",
wickets = 10,
matches = 5,
balls_bowled = 750,
runs_conceded 463.
Output:
Name: Sachin
bowling_avg=46.3
Note:
a.	If any  values are negative print 'Error'.
b.	If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.
Method name: showStatistics
Return type: void
This method should print the details of the batsman.
Input: 
name = "Sachin",
wickets = 10,
matches = 5,
balls_bowled = 750,
runs_conceded 463.
Output: 
Name=Sachin
wickets=10
matches=5
balls_bowled=750
runs_conceded=463
Note: 
a. If any  values are negative print 'Error'.
b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.
Method name: computeStrikeRate
Return type: void
This method should print the Strike Rate of the bowler by dividing runs_conceded with balls_bowled.
Input: 
name = "Sachin",
wickets = 10,
matches = 5,
balls_bowled = 750,
runs_conceded 463.
Output: 
Name: Sachin
Strike_rate=0.61733335
Note: 
a. If any values are negative print 'Error'.
b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.
Given a class Testing that contains main method.  Create object of bowler by providing above input values. And call the Bowler class methods.
Use this class to test your code.
 */
import java.util.Scanner;

class Bowler {
    private String name;
    private int wickets;
    private int matches;
    private int balls_bowled;
    private int runs_conceded;

    public Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.balls_bowled = 0;
        this.runs_conceded = 0;
    }

    public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    public void computeBowlingAverage() {
        if (isInvalidData()) {
            System.out.println("Error");
            return;
        }
        if (wickets == 0) {
            System.out.println("Name: " + name);
            System.out.println("bowling_avg: 0.0");
        } else {
            double bowling_avg = (double) runs_conceded / wickets;
            System.out.println("Name: " + name);
            System.out.println("bowling_avg: " + bowling_avg);
        }
    }

    public void showStatistics() {
        if (isInvalidData()) {
            System.out.println("Error");
            return;
        }
        System.out.println("Name = " + name);
        System.out.println("wickets = " + wickets);
        System.out.println("matches = " + matches);
        System.out.println("balls_bowled = " + balls_bowled);
        System.out.println("runs_conceded = " + runs_conceded);
    }

    public void computeStrikeRate() {
        if (isInvalidData()) {
            System.out.println("Error");
            return;
        }
        if (balls_bowled == 0) {
            System.out.println("Name: " + name);
            System.out.println("Strike_rate: 0.0");
        } else {
            double strike_rate = (double) runs_conceded / balls_bowled;
            System.out.println("Name: " + name);
            System.out.println("Strike_rate: " + strike_rate);
        }
    }

    private boolean isInvalidData() {
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            return true;
        }
        if (matches == 0 && (balls_bowled > 0 || runs_conceded > 0)) {
            return true;
        }
        return false;
    }
}

public class ps_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Bowler's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Number of Wickets: ");
        int wickets = scanner.nextInt();

        System.out.print("Enter Number of Matches: ");
        int matches = scanner.nextInt();

        System.out.print("Enter Number of Balls Bowled: ");
        int balls_bowled = scanner.nextInt();

        System.out.print("Enter Number of Runs conceded: ");
        int runs_conceded = scanner.nextInt();

        Bowler bowler = new Bowler(name, wickets, matches, balls_bowled, runs_conceded);

        bowler.computeBowlingAverage();
        bowler.showStatistics();
        bowler.computeStrikeRate();

        scanner.close();
    }
}