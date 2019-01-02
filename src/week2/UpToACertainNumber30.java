package week2;

import java.util.Scanner;

public class UpToACertainNumber30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number?");
        int enteredNumber = Integer.parseInt(reader.nextLine());

        int number = 1;
        while(number<=enteredNumber){
            System.out.println(number);
            number++;

        }

    }
}
