package week3;

import java.util.Scanner;

public class SeparatingFirstCharacters50 {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        if(word.length()>3){
            for (int i=0;i<5;i++){
                System.out.println((i+1)+". character: "+word.charAt(i));
            }
        }

    }
}
