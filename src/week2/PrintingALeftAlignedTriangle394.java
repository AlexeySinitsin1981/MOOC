package week2;

public class PrintingALeftAlignedTriangle394 {
    private static void printStars(int amount) {
        int i = 0;
        while ( i < amount ) {
            System.out.print("*");
            i++;
        }
        System.out.println(" ");
    }

    private static void printTriangle(int size){
        int i =0;
        while (i <= size) {
            printStars(i);
            i++;
        }
    }

    public static void main(String[] args) {

        printTriangle(4);
    }
}


