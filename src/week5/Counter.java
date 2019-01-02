package week5;

public class Counter {
    private int startingValue;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);

    }

    public Counter(boolean check) {

        this(0, check);
    }

    public Counter() {
        this.startingValue = 0;
        this.check = false;
    }

    public int value(){

        return this.startingValue;
    }

    public void increase(){

        startingValue++;
    }

    public void decrease(){
        if(startingValue>=1){
            startingValue--;
        }else{
        this.startingValue=startingValue;
        }
    }

    public void increase(int increaseAmount){
        if(increaseAmount<0){
            this.startingValue=startingValue;
        }else{
            this.startingValue = this.startingValue + increaseAmount;
        }
    }

    public void decrease(int decreaseAmount){
        if(decreaseAmount<0){
            this.startingValue=startingValue;
        }else{
            this.startingValue = this.startingValue - decreaseAmount;
        }
    }

    @Override
    public String toString() {
        return "Counter{" +
                "startingValue=" + startingValue +
                ", check=" + check +
                '}';
    }
}
