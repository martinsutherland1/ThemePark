import attractions.*;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ThemeParkTest {

    ThemePark themePark;
    TobaccoStall tobaccoStall;
    CandyflossStall candyflossStall;
    Dodgems dodgems;
    RollerCoaster rollerCoaster;
    Park park;
    Playground playground;
    IceCreamStall iceCreamStall;

    Visitor visitor, visitor2;


    @Before
    public void before(){
        themePark = new ThemePark();
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 6);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 4);
        dodgems = new Dodgems("Bumper Cars", 5);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        park = new Park("Central", 8);
        playground = new Playground("Disney", 10);
        iceCreamStall = new IceCreamStall("Mr Wippy", "Bob", ParkingSpot.A1, 10);
        visitor = new Visitor(30, 220, 30.00);
        visitor2 = new Visitor(10, 160, 4.00);


    }

    @Test
    public void canAddAttractionToThemePark(){
        themePark.addToAttractions(dodgems);
        assertEquals(1, themePark.getAttractionsSize());
    }

    @Test
    public void canAddStallToThemePark(){
        themePark.addToStalls(candyflossStall);
        assertEquals(1, themePark.getStallsSize());
    }

    @Test
    public void cantAddDuplicates(){
        themePark.addToStalls(candyflossStall);
        themePark.addToAttractions(dodgems);
        themePark.addToAttractions(dodgems);
        themePark.addToStalls(candyflossStall);
        assertEquals(1, themePark.getStallsSize());
        assertEquals(1, themePark.getAttractionsSize());
    }

    @Test
    public void canVisitorAddToList(){
        themePark.addToVisitorList(visitor, dodgems);
        assertEquals(true, visitor.getAttractions().contains(dodgems));
        assertEquals(1, visitor.getAttractions().size());
    }

    @Test
    public void canIncreaseVisitCount(){
        themePark.addToVisitorList(visitor, dodgems);
        themePark.addToVisitorList(visitor2, dodgems);
        assertEquals(2, dodgems.getVisitCount());
    }

    @Test
    public void canAddAllReviewedToArray(){
        themePark.addToStalls(candyflossStall);
        themePark.addToStalls(tobaccoStall);
        themePark.addToStalls(iceCreamStall);
        themePark.addToAttractions(rollerCoaster);
        themePark.addToAttractions(dodgems);
        themePark.addToAttractions(park);
        themePark.addToAttractions(playground);

        assertTrue(themePark.addReviewedToList().contains(dodgems));
        assertTrue(themePark.addReviewedToList().contains(candyflossStall));
        assertTrue(themePark.addReviewedToList().contains(tobaccoStall));
        assertTrue(themePark.addReviewedToList().contains(iceCreamStall));
        assertTrue(themePark.addReviewedToList().contains(rollerCoaster));
        assertTrue(themePark.addReviewedToList().contains(park));
        assertTrue(themePark.addReviewedToList().contains(playground));
    }


}
