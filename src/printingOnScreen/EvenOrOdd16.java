package printingOnScreen;

import java.io.PrintStream;
import java.util.Scanner;

public class EvenOrOdd16 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int remainder = number % 2;
        if(remainder>0){
            System.out.println("The number is not even");
        }else{
            System.out.println("The number is even");
        }


    }
}
