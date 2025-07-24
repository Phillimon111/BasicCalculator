/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradingsystemapp;
import java.util.Scanner;

/**
 *
 * @author Phillimon Mogofe
 */
public class GradingSystemApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("===== Welcome to the Grading System =====");

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nStudent " + i + ":");
            int marks;

            System.out.print("Enter marks (0 - 100): ");

            if (scanner.hasNextInt()) {
                marks = scanner.nextInt();
            } else {
                System.out.println("Invalid input! Please enter a whole number.");
                scanner.next(); // discard bad input
                i--; // retry this student
                continue;
            }

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Must be between 0 and 100.");
                i--;
                continue;
            }

            if (marks == 0) {
                System.out.println("Student scored zero. Exiting program.");
                break;
            }

            int gradePoint;
            if (marks >= 90) {
                gradePoint = 5;
            } else if (marks >= 80) {
                gradePoint = 4;
            } else if (marks >= 70) {
                gradePoint = 3;
            } else if (marks >= 60) {
                gradePoint = 2;
            } else {
                gradePoint = 1;
            }

            System.out.print("Grade: ");
            switch (gradePoint) {
                case 5:
                    System.out.println("Excellent (5 Points)");
                    break;
                case 4:
                    System.out.println("Very Good (4 Points)");
                    break;
                case 3:
                    System.out.println("Good (3 Points)");
                    break;
                case 2:
                    System.out.println("Pass (2 Points)");
                    break;
                case 1:
                    System.out.println("Fail (1 Point)");
                    break;
                default:
                    System.out.println("Error in grading.");

            }
        }

        scanner.close();
        System.out.println("\nGrading process complete.");
    }
} 
        
