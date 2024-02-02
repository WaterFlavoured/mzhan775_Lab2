package Q1;
/*
* This program will print out programmer information and program description then,
* using the scanner object to allow user input, they have to input a 4-digit number between 1111 and 9999
* without zeroes. The program will then print out the single digits (in order of thousands, hundreds, tens, ones)
* and calculate and print RMS formatted to 2 decimals
*
* @author Michael Zhang 251350700
* @since 2024-01-30
* */
import java.util.Scanner; // importing built in library class called Scanner form java.util package

public class MathBugs { // declaration of mandatory class named MathBugs
    public static void main(String[] args) {// the public entry point method named main(), aka driver method
        // Declaration of variables and objects
        Scanner input = new Scanner(System.in);
        int x, thousandsDigit, hundredsDigit, tensDigit, onesDigit;
        double rms;

        // Prints out Programmer information and description of program using println method
        System.out.println("****************************************************");
        System.out.println("Full Name: Michael Zhang");
        System.out.println("Student Number: 251350700");
        System.out.println("Date: 2024-01-29");
        System.out.println("Brief description of the task: Using the scanner to\n" +
                "allow user input, they have to input a 4-digit number\n" +
                "between 1111 and 9999 without zeroes\n" +
                "where the program will print out the single digits\n" +
                "and calculate and print the RMS");
        System.out.println("*****************************************************");

        // User prompt
        System.out.print("Enter a 4-digit number: ");

        x = input.nextInt();

        thousandsDigit = x / 1000; // Calculates the thousands digit
        hundredsDigit = (x % 1000) / 100; // Calculates the hundreds digit
        tensDigit = x / 10 % 10; // Calculates the tens digit
        onesDigit = (x % 1000) % 10; // Calculates the ones digit

        // Using rms formula, calculates rms using arithmetic operations and methods from class Math such as pow() and sqrt()
        rms = Math.sqrt((Math.pow(thousandsDigit, 2) + Math.pow(hundredsDigit, 2)
                + Math.pow(tensDigit, 2) + Math.pow(onesDigit, 2))/4.0);

        // Prints out singular digits using println method
        System.out.println(thousandsDigit);
        System.out.println(hundredsDigit);
        System.out.println(tensDigit);
        System.out.println(onesDigit);

        // Prints out the RMS value formatted to 2 decimal digits using printf
        System.out.printf("The RMS value of the above four digits is: %.2f\n", rms);
        System.out.println("*****************************************************");
    }
}
