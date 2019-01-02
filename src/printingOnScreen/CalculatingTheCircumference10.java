package printingOnScreen;

import java.util.Scanner;

public class CalculatingTheCircumference10 {


    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int number = Integer.parseInt(reader.nextLine());

        double radius = 2 * number * Math.PI;

        System.out.println("Circumference of the circle: " + radius);
    }
}
