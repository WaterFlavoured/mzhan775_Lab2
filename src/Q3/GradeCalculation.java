package Q3;

/*
* This program will print out programmer info and program description, then
* calculates the final grade of user by having user input 3 grades. Then the program will have pre-set
* values for the weight; which in this case they are set as constants of 0.2, 0.3, 0.5 respectively. Then it will
* calculate using equation: (grade1 * GRD1_WGT) + (grade2 * GRD2_WGT) + (grade3 * GRD3_WGT) and output the grade with
* 2 decimal formatting
*
* @author Michael Zhang 251350700
* @since 2024-01-31
* */
import java.util.Scanner; // importing built in library class called Scanner form java.util package

public class GradeCalculation { // declaration of mandatory class named GradeCalculation
    public static void main(String[] args) { // the public entry point method named main(), aka driver method
        // Declaration of Variables, Constants and Objects
        Scanner input = new Scanner(System.in);
        double grade1, grade2, grade3, fGrade;
        final double GRD1_WGT = 0.2;
        final double GRD2_WGT = 0.3;
        final double GRD3_WGT = 0.5;

        // Prints out Programmer information and description of program using println method
        System.out.println("*****************************************************");
        System.out.println("Full Name: Michael Zhang");
        System.out.println("Student Number: 251350700");
        System.out.println("Date: 2024-01-29");
        System.out.println("Brief description of the task: Program will ask user\n" +
                "to enter 3 different grades on 3 lines where\n" +
                "program will have set weights of the grade\n" +
                "and calculate the average and print it out");
        System.out.println("*****************************************************");

        // User Prompt
        System.out.println(); // adding spacing between the user prompt and the line above
        System.out.print("Input the first grade: ");
        grade1 = input.nextDouble();

        System.out.print("Input the second grade: ");
        grade2 = input.nextDouble();

        System.out.print("Input the third grade: ");
        grade3 = input.nextDouble();

        /*Calculating the final grade by multiplying each grade with the respective weight constant,
        and then adding them together */
        fGrade = (grade1 * GRD1_WGT) + (grade2 * GRD2_WGT) + (grade3 * GRD3_WGT);

        System.out.println(); // spacing between input and output

        // Prints out the final grade with only 2 decimals using printf method
        System.out.printf("The course grade is: %.2f\n", fGrade);
        System.out.println("*****************************************************");
    }
}
