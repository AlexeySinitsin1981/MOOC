package week4;

import java.util.ArrayList;
import java.util.Random;


public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
        int buffer;

        while(this.numbers.size()<6){
            buffer = this.random.nextInt(45)+1;

            if(!this.containsNumber(buffer)){
                this.numbers.add(buffer);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers
        if(this.numbers.contains(number)){
            return true;
        } else {
            return false;
        }
    }
}
