package week2;

import java.util.Random;
import java.util.Scanner;

public class GuessingANumberGame41 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int counter=0;

        while (true) {
            System.out.println("Guess a number: ");
            int number = Integer.parseInt(reader.nextLine());
            counter++;
            if (number < drawNumber()) {
                System.out.println("The number is lesser, guesses made: " + counter);
            } else if (number > drawNumber()) {
                System.out.println("The number is greater, guesses made: " + counter);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }
    private static int drawNumber(){
        return new Random().nextInt();
    }
}
