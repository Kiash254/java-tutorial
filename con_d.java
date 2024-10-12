// create an if else statement in java to hcekc the eage of a person  baed on the input
//  if the age is less than 18, print "You are a minor."
//  if the age is between 18 and 65, print "You are an adult."
//  if the age is 65 or older, print "You are a senior citizen."
//  if the age is negative, print "Invalid age."
// make sure it has user input

import java.util.Scanner;


public class con_d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check the age and print the result
        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        scanner.close();
    }
}