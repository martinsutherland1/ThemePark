import attractions.Attraction;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {


    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(){
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();


    }

    public ArrayList<Attraction> getAttractions(){
        return this.attractions;
    }

    public ArrayList<Stall> getStalls(){
        return this.stalls;
    }

    public void addToAttractions(Attraction attraction){
        if (!getAttractions().contains(attraction)){
            getAttractions().add(attraction);
        }
    }

    public void addToStalls(Stall stall){
        if (!getStalls().contains(stall)){
            getStalls().add(stall);
        }
    }

    public int getStallsSize(){
        return getStalls().size();

    }

    public int getAttractionsSize(){
        return getAttractions().size();

    }

    public void addToVisitorList(Visitor visitor, Attraction attraction){
        visitor.addAttraction(attraction);
        attraction.incrementVisitCount();


    }

    public int addReviewedToList(){
        ArrayList<Object> reviewedItems = null;

        reviewedItems.addAll(this.attractions);

        reviewedItems.addAll(this.stalls);

        return reviewedItems.size();
    }



}
