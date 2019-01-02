package week3;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();

        String help = "";
            int count = text.length()-1;
            for (int i = 1; i <=text.length() ; i++) {
                help = help + text.charAt(count);
                count--;
            }
        System.out.println(help);
        }
    }
