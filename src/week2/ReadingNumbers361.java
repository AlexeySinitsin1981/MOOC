package week2;

import java.util.Scanner;

public class ReadingNumbers361 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        //int number = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int count = 0;
        double average = 0;
        int even=0;
        int odd=0;



        while (true){
            int number = Integer.parseInt(reader.nextLine());
            if(number==-1){
                System.out.println("Thank you and see you later!");
                break;
            }
            if(number%2==0){
                even++;
            }else{
                odd++;
            }
            sum = sum + number;
            count++;
            average=(double)sum/count;

        }
        System.out.println("The sum is "+ sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
