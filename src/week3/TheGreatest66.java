package week3;

import java.util.ArrayList;

public class TheGreatest66 {
    public static int greatest(ArrayList<Integer> list) {
        // write your code here
        int min = list.get(0);
        int max = list.get(0);

        for (Integer i: list) {
            if(i < min)
                min = i;
            if(i > max)
                max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }

}
