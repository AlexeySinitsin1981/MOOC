package week4;

public class BackToInitialValue754 {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }

    public static class DecreasingCounter {
        private int value;   // object variable that remembers the value of the counter
        private int firstValue;

        public DecreasingCounter(int valueAtStart) {

            this.value = valueAtStart;
            this.firstValue = valueAtStart;
        }

        public void printValue() {

            System.out.println("value: " + this.value);
        }

        public void decrease() {

            if (value > 0) {
                value = value - 1;
            } else {
                value = 0;
            }
        }

        public void reset() {
            value = 0;
        }
        public void setInitial(){
            value = firstValue;
        }
    }
}
