package week4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics statsEven = new NumberStatistics();
        NumberStatistics statsOdd = new NumberStatistics();

        System.out.println("Type numbers: ");
        while (true){
            Scanner reader = new Scanner(System.in);
            int number = Integer.parseInt(reader.nextLine());

            if(number!=-1){
                stats.addNumber(number);
                if(number%2==0){
                    statsEven.addNumber(number);
                }else if(number%2!=0){
                    statsOdd.addNumber(number);
                }

            }else{
                System.out.println("sum: " + stats.sum());
                System.out.println("sum of even: " + statsEven.sum());
                System.out.println("sum of odd: " + statsOdd.sum());
            }

        }
    }
}
