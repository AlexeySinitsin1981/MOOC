package week3;

import java.util.Scanner;

public class TheEndPart54{
        public static void main(String[] args) {
            System.out.println("Type a word: ");
            Scanner reader = new Scanner(System.in);
            String word = reader.nextLine();
            System.out.println("Length of the first part: ");
            int number = Integer.parseInt(reader.nextLine());
            int count = word.length() - number;
            System.out.println("Result: " + word.substring(count));
        }
}
