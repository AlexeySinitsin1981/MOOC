package week3;

import java.util.Scanner;

public class FirstPart53 {
    public static void main(String[] args) {
        System.out.println("Type a word: ");
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        System.out.println("Length of the first part: ");
        int number = Integer.parseInt(reader.nextLine());

        System.out.println("Result: " + word.substring(0, number));
    }
}
