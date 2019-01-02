package printingOnScreen;

import java.util.Scanner;

public class adder8 {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Enter the second number^ ");
        int secondNumber = Integer.parseInt(reader.nextLine());


        int total = firstNumber + secondNumber;

        System.out.println("The sum of the numbers is: " + total);
    }
}
