package week2;

public class PrintingARectangle393 {
    private static void printStars(int amount) {
        int i = 0;
        while ( i < amount ) {
            System.out.print("*");
            i++;
        }
        System.out.println(" ");
    }

    private static void printRectangle(int width, int height){
        int i =0;
        while (i < height){
            printStars(width);
            i++;
        }
    }

    public static void main(String[] args) {
        printRectangle(17, 3);
    }
}
