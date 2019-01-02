package printingOnScreen;

import java.util.Scanner;

public class BiggerNumber11 {
    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Enter the second number ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        if(firstNumber>secondNumber){
            System.out.println("First number more!");
        }else if(firstNumber<secondNumber){
            System.out.println("Second number more!");
        }else if(firstNumber==secondNumber){
            System.out.println("The numbers are equal!");
        }


    }
}
