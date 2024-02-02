package Q2;

/* Program will print out programmer information and then program description, then will ask user
* to input a height and radius on two separate lines using a scanner
* and then calculate the volume by using the volume formula for the cone.
* Finally, the program will print out the value after calculations formatted to 2 decimal points.
*
* @author Michael Zhang 251350700
* @since 2024-01-30*/
import java.util.Scanner; // importing built in library class called Scanner form java.util package

public class VolumeOfCone { // declaration of mandatory class named VolumeOfCone
    public static void main(String[] args) {// the public entry point method named main(), aka driver method
        // Declaration of Variables and Objects.
        Scanner input = new Scanner(System.in);
        double h, r, v;

        // Prints out Programmer information and description of program using println method
        System.out.println("*****************************************************");
        System.out.println("Full Name: Michael Zhang");
        System.out.println("Student Number: 251350700");
        System.out.println("Date: 2024-01-29");
        System.out.println(
                "Brief description of the task: Program will ask user\n" +
                "to input a height and radius on two separate lines and then\n" +
                "print out the value after calculations"
        );
        System.out.println("*****************************************************");
        // User Prompt
        System.out.print("Please enter the height of a cone: ");
        h = input.nextDouble();
        System.out.print("Please enter the radius of the cone: ");
        r = input.nextDouble();

        /* Calculates volume by calling Math.PI for pi then multiplying by variable r to the power of 2
         * through Math.pow then multiply by variable h which is divided overall by double value 3.0*/
        v = (Math.PI * Math.pow(r, 2) * h) / 3.0;

        // Prints out volume of the cone with initial dimensions formatted to 2 decimal points using printf method
        System.out.printf("The volume of a cone with radius %.2f cm and height %.2f cm is: %.2f cubic cm", r, h, v);

    }
}
