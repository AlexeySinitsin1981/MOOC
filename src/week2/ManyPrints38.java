package week2;

import java.util.Scanner;

public class ManyPrints38 {
    public static void main(String[] args) {
        System.out.println("How many?");
        Scanner reader = new Scanner(System.in);
        int number = Integer.parseInt(reader.nextLine());
        for (int i = 0; i < number; i++) {
        printText();
        }
    }

    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
