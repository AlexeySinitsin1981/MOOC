package week2;

public class test3 {
    public static void greet(String name) {
        System.out.println("Hi " + name + ", greetings from the world of methods!");
    }

    public static void greetManyTimes(String name, int times) {
        int i = 0;
        while ( i < times ) {
            greet(name);
            i++;
        }

    }

    public static void main(String[] args) {
        greetManyTimes("Anthony", 3);
        System.out.println("and");
        greetManyTimes("Martin", 2);
    }
}
