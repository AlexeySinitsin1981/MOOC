package week3;

import java.util.Scanner;

public class LastCharacter49 {
    public static char lastCharacter(String text){
        char LC = text.charAt(text.length()-1);
        return LC;

    }

    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        char character = lastCharacter(word);
        System.out.println("Last character: " + character);


    }
}
