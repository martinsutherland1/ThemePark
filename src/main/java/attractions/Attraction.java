package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

import java.security.Security;

public abstract class Attraction implements ITicketed, ISecurity, IReviewed {
    private String name;
    private int rating;
    private int visitCount;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void incrementVisitCount(){
        this.visitCount += 1;
    }

    public double defaultPrice(){
        return 0.00;

    }

    public double priceFor(Visitor visitor){
        return defaultPrice();
    }

    public boolean isAllowedTo(Visitor visitor){
        return true;

    }







}
