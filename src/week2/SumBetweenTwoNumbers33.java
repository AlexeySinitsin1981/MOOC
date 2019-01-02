package week2;

import java.util.Scanner;

public class SumBetweenTwoNumbers33 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        int sum = 0;
       // int firstNumber = 1;


        while (firstNumber <= secondNumber) {
            sum = sum + firstNumber;
            firstNumber++;
        }
        System.out.println("Итоговая сумма: " + sum);
    }
}
