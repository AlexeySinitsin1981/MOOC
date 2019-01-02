package week5;

public class Main {
    public static void main(String[] args) {
        Counter count = new Counter(2, true);
        count.increase();
        System.out.println(count);
        count.decrease();
        System.out.println(count);
        count.increase(15);
        System.out.println(count);
        count.decrease(5);
        System.out.println(count);

    }
}
