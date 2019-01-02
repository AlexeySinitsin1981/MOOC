package week3;

import java.util.ArrayList;

public class AverageOfNumbers64 {
    public static double average(ArrayList<Integer> list) {
        // write your code here
       // double aver = sum(list) / ;
        //return aver;
        double total = sum(list);
        double aver=0.0;

        return aver = total/list.size();
    }

    public static int sum(ArrayList<Integer> list) {
        int count = list.size()-1;
        int sum = 0;
        while (count>=0){
            sum=sum+list.get(count);
            count--;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }

}
