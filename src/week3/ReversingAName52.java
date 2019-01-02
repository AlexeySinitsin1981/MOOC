package week3;

import java.util.Scanner;

public class ReversingAName52 {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();


        int i = word.length() - 1;
        while (i >= 0) {
            System.out.print(word.charAt(i));
            i--;
        }
    }
}

