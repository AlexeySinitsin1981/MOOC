package week4;

import java.util.Random;

public class PasswordRandomizer {
    // Define the variables here
    private Random random;
    private int length;

    public PasswordRandomizer(int length) {
        // Format the variable here
        this.length = length;
        random = new Random();

    }

    public String createPassword() {
        // Write the code here which returns the new password
        String buffer = "";

        for(int i=0; i<this.length;i++){
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26));
            buffer = buffer + symbol;
        }

        return buffer;
    }
}
