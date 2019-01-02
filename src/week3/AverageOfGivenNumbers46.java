package week3;

public class AverageOfGivenNumbers46 {
    public static double average(int number1, int number2, int number3, int number4) {

        double average = (double)(number1+number2+number3+number4)/4;
        return average;
        // write your code here
    }

    public static void main(String[] args) {
        double answer = average(4, 3, 6, 1);
        System.out.println("average: " + answer);
    }
}
