package week3;

import java.util.Scanner;

public class ReversingText56 {
    public static String reverse(String text) {
        String help = "";
        for (int i = text.length()-1; i >= 0; i--) {
            char character = text.charAt(text.length()-1);
            help = help + character;

        }
        return help;

    }

    public static void main(String[] args) {
        System.out.print("Type in your text: ");
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }


}
