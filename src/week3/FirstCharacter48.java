package week3;

import java.util.Scanner;

public class FirstCharacter48 {
    public static char firstCharacter(String text){
        char oneCharacter = text.charAt(0);
        return oneCharacter;


    }

    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        char character = firstCharacter(name);
        System.out.println("First character: " + character);
    }
}
