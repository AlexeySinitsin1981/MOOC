package week2;

import java.util.Scanner;

public class TheSumOfASetOfNumbers32 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("To what?");
        int number = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int count = 1;


        while (count <= number) {
            sum = sum + count;
            count++;
        }
        System.out.println("Итоговая сумма: " + sum);


    }
}
