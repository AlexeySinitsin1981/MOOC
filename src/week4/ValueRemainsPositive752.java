package week4;

public class ValueRemainsPositive752 {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(2);

        counter.printValue();

        counter.decrease();
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

           if (value>0){
               value = value - 1;
           }else{
               value=0;
           }

        }
    }
}