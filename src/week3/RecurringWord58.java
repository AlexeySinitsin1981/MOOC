package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord58 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();

        while (true){
            System.out.println("Type a word: ");
            Scanner reader = new Scanner(System.in);
            String word = reader.nextLine();

            if (!words.contains(word)) {
                words.add(word);
            }else{
                System.out.println("You gave the word " + word + " twice");
                break;
            }
        }
    }
}
