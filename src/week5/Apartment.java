package week5;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public boolean larger(Apartment otherApartment){
        if(this.rooms>otherApartment.rooms){
            return true;
        }
        if(this.rooms==otherApartment.rooms && this.squareMeters>otherApartment.squareMeters){
            return true;
        }
        if(this.rooms==otherApartment.rooms && this.squareMeters>otherApartment.squareMeters &&
                this.pricePerSquareMeter>otherApartment.pricePerSquareMeter){
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment otherApartment){
        int first = this.squareMeters*this.pricePerSquareMeter;
        int second = otherApartment.squareMeters*otherApartment.pricePerSquareMeter;
        if(first>second){
            return first-second;
        }else
            return second-first;

    }
}
