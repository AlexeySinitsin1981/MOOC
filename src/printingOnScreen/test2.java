package printingOnScreen;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число цифрами: ");

        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            System.out.print("Вы ввели число: " + i);
        }else{
            System.out.println("Это не цифры, животное!!!");
        }
    }
}
