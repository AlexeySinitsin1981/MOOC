package week4;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = reader.nextInt();
        System.out.print("minutes: ");
        int m = reader.nextInt();
        System.out.print("hours: ");
        int h = reader.nextInt();

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            System.out.println(hours + ":" + minutes +":"+seconds);
            if(seconds.getValue() == 59){

                if(minutes.getValue() == 59) {
                    hours.next();
                }
                minutes.next();
                seconds.next();
            } else {
                seconds.next();
            }
            i++;

        }

    }

}


/* if (minutes.getValue() == 59) {

                if (hours.getValue() == 23) {
                    hours.next();

                }
                hours.next();
                minutes.next();
            } else {
                minutes.next();

            }*/

