package printingOnScreen;

import java.util.Scanner;

public class divider9 {
    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float firstNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Enter the second number ");
        float secondNumber = Integer.parseInt(reader.nextLine());


        float total = (float)(firstNumber / secondNumber);

        System.out.println("Result: " + total);
    }
}
