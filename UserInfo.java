import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user inputs
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height in cm: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your BMI: ");
        double bmi = scanner.nextDouble();

        // Calculate the sum of the numbers
        double sum = age + height + weight + bmi;

        // Determine health status based on BMI
        String healthStatus;
        if (bmi < 18.5) {
            healthStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            healthStatus = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            healthStatus = "Overweight";
        } else {
            healthStatus = "Obese";
        }

        // Print the results
        System.out.println("Sum of age, height, weight, and BMI: " + sum);
        System.out.println("Health status based on BMI: " + healthStatus);

        scanner.close();
    }
}