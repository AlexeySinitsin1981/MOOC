package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Words57 {
    public static void main(String[] args) {
        ArrayList <String> words = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word: ");
            Scanner reader = new Scanner(System.in);
            String word = reader.nextLine();
            words.add(word);
            if(word.isEmpty()){
                break;
            }

        }
        System.out.println("You typed the following words:");
        for (String w:words) {
            System.out.println(w);
        }

    }

}
