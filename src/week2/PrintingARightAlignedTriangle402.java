package week2;

public class PrintingARightAlignedTriangle402 {
    private  static  void  printStars (int amount)  {
        int i = 0;
        while (i < amount){
            System.out.print("*");
            System.out.print("  ");
            i++;

        }
        System.out.println();
    }


    public static void printWhitespaces(int size){
        int a = 0;
        while(a<=size){
            printStars(a);
            a++;
        }
    }

     public static void printTriangle(int size){
         int starsAmount = 0;
         while(starsAmount<=size){
             printStars(starsAmount);
             int b = size - starsAmount;
             printWhitespaces(b);
             starsAmount++;
         }
     }

    public  static  void  main (String [] args)  {

        printTriangle(4);
    }

}
