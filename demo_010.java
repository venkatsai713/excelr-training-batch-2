public class demo_010 {

    public static double calculateCircleArea(double radius) {

        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        double radius = 5;
        double area = calculateCircleArea(radius);

        System.out.println("The area of the circle with radius " + radius + " is " + area);
    }
}