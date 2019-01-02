package week4;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit=upperLimit;
        this.value=0;
    }

    public void next() {
        value++;
        if(value>upperLimit){
            value=0;
        }
    }
    public String toString() {
        return String.format("%02d", value);
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int newValue){
    if(newValue>0 && newValue<=upperLimit){
        this.value=newValue;
    }
    }
}
