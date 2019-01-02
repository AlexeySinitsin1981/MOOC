package week2;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        /*Scanner reader = new Scanner(System.in);
        System.out.println("Введи число: ");
        while (reader.hasNextInt()) {
            int i = reader.nextInt();
            System.out.print("Вы ввели число: " + i);
        }*/
        /*int result =  0 ;

        int i =  0 ;
        while  ( i <  4 )  {
            result = result +  3 ;
            i ++;   // означает то же, что и i = i + 1;
            System.out.println(result);
        }*/
        System.out.println("Type your age: ");
        Scanner reader = new Scanner(System.in);
        int age = Integer.parseInt(reader.nextLine());

        while (age < 5 || age > 85) {  // age less than 5 OR greater than 85
            System.out.println("You are lying!");
            if (age < 5) {
                System.out.println("You are so young that you cannot know how to write!");
            } else if (age > 85) {
                System.out.println("You are so old that you cannot know how to use a computer!");
            }

            System.out.println("Type your age again: ");
            age = Integer.parseInt(reader.nextLine());
        }

        System.out.println("Your age is " + age);

    }
}
