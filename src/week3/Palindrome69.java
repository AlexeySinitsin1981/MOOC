package week3;

import java.util.Scanner;

public class Palindrome69 {
    public static boolean palindrome(String text) {
        // write your code here
        String help = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            char character = text.charAt(text.length() - 1);
            help = help + text.charAt(i);
        }
        if (text.equals(help)) {
            return true;
        }
        return false;

    }

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);

            System.out.println("Type a text: ");
            String text = reader.nextLine();
            if (palindrome(text)) {
                System.out.println("The text is a palindrome!");
            } else {
                System.out.println("The text is not a palindrome!");
            }

        }
    }