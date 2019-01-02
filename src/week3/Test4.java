package week3;

public class Test4 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 5;

        boolean firstGreater = true;

        if (num1 <= num2) {
            firstGreater = false;
        }

        if (firstGreater) {  // means the same as firstGreater==true
            System.out.println("num1 was greater");
        } else {
            System.out.println("num1 was not greater");
        }
    }
}
