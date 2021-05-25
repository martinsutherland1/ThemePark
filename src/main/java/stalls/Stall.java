package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public abstract class Stall implements ISecurity, IReviewed {

    private String name;
    private String ownerName;
    private ParkingSpot parkingSpot;
    private int rating;

    public Stall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public boolean isAllowedTo(Visitor visitor){
        return true;

    }

    public int getRating(){
        return this.rating;
    }
}
