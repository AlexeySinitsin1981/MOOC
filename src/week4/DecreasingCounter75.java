package week4;

public class DecreasingCounter75 {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();
    }

    public static class DecreasingCounter {
        private int value;   // object variable that remembers the value of the counter

        public DecreasingCounter(int valueAtStart) {

            this.value = valueAtStart;
        }

        public void printValue() {
            System.out.println("value: " + this.value);
        }

        public void decrease() {
            value = value - 1;        // write here the code that decrements the value of counter by one
        }

        // and here the rest of the methods
    }

}


