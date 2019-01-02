package week5;

public class Reformatory {

    private int totalWeight;

    public int weight(Person person) {

        totalWeight++;
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }

    public int totalWeightsMeasured(){
        return totalWeight;
    }
}
