package printingOnScreen;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        System.out.println("welcome to the calculator");

        while (true) {
            System.out.print("Enter a command (sum, difference, quit): ");
            Scanner reader =new Scanner(System.in);
            String command = reader.nextLine();
            if (command.equals("quit")) {
                break;
            }

            System.out.print("enter the numbers: ");
            int first = Integer.parseInt(reader.nextLine());
            System.out.print("enter the second numbers: ");
            int second = Integer.parseInt(reader.nextLine());

            if (command.equals("sum") ) {
                int sum = first + second;
                System.out.println( "The sum of the numbers is: " + sum );
            } else if (command.equals("difference")) {
                int difference = first - second;
                System.out.println("The difference of the numbers is: " + difference);
            } else {
                System.out.println("Unknown command");
            }

        }

        System.out.println("Thanks, bye!");
    }
}
