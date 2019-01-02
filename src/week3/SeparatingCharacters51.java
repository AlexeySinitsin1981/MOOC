package week3;

import java.util.Scanner;

public class SeparatingCharacters51 {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        int i=0;
        while (word.length()>i){
            System.out.println((i+1)+". character: "+word.charAt(i));
            i++;
        }
    }
}
