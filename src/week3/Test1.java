package week3;

public class Test1 {
        public static void main(String[] args) {
            xmasTree(4);
        }

        private static void printStars(int amount) {

            for (int i = 1; i <= amount; i++) {
                System.out.print("*");
            }
        }
        private static void printSquare(int sideSize){

            for (int i = 1; i <=sideSize ; i++) {
                printStars(sideSize);
                System.out.println();
            }
        }

        private static void printRectangle(int width, int height){

            for (int i = 1; i <=height ; i++) {
                printStars(width);
                System.out.println();
            }
        }

        private static void printTriangle(int size){

            for (int i = 1; i <=size ; i++) {
                printStars(i);
                System.out.println();
            }
        }

        private static void printWhitespaces(int size){
            for (int i = 1; i <= size; i++) {
                System.out.print(" ");
            }
        }


        private static void printTriangle2 (int size){

            for (int i = 1; i <=size; i++) {
                printWhitespaces(size-i);
                printStars(i);
                System.out.println();
            }
        }

        private static void xmasTree(int height){

            for (int i = 1; i <=height ; i++) {
                printWhitespaces(height-i);
                printStars(i);
                printStars(i-1);
                System.out.println();
            }
            printWhitespaces(height-2);
            printStars(3);
            System.out.println();
            printWhitespaces(height-2);
            printStars(3);
        }
    }

