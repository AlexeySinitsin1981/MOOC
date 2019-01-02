package week2;

public class Printing391 {
    private static void printStars(int amount) {

        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }

        System.out.println(" ");
    }

        private static void printSquare(int sideSize){
        for (int i = 0; i < sideSize; i++) {
            printStars(4);
        }


    }


    public static void main(String[] args) {
       //printStars(5);
        //printStars(3);
        //printStars(9);
        printSquare(4);
    }


}
