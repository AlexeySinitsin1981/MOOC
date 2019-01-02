package week3;

import java.util.Scanner;

public class TheLengthOfAName47 {
    public static int calculateCharacters(String text){
        int number = text.length();
        return number;

    }

    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        int catchNumber = calculateCharacters(name);
        System.out.println("Number of characters: " + catchNumber);

    }
}
