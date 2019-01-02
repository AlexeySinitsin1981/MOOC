package printingOnScreen;

import java.util.Scanner;

public class APositiveNumber14 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type your number: ");
        int number = Integer.parseInt(reader.nextLine());
        if(number>0){
            System.out.println("The number is positive.");
        }else{
            System.out.println("The number is not positive!");
        }
    }
}
