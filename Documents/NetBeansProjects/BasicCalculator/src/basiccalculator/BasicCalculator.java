/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basiccalculator;

/**
 *
 * @author Phillimon Mogofe
 */
public class BasicCalculator {

    
    // Instance variables
    double x;
    double y;

    // Constructor using 'this' keyword to set instance variables
    public BasicCalculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Addition method
    public double add() {
        return this.x + this.y;
    }

    // Subtraction method
    public double subtract() {
        return this.x - this.y;
    }

    // Multiplication method
    public double multiply() {
        return this.x * this.y;
    }

    // On error division method.
    public double divide() {
        if (this.y == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return this.x / this.y;
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Testing with int and double
         int x = 66;
        double y = 12.6;

        // Object
        BasicCalculator calc = new BasicCalculator(x, y);

        // Output display test
        System.out.println("a = " + x + ", y = " + y);
        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());

    }
    
}      
       