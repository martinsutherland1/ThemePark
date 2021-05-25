package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;
    Visitor visitor, visitor2;

    @Before
    public void setUp() throws Exception {
        park = new Park("Leafy Meadows", 9);
        visitor = new Visitor(30, 220, 30.00);
        visitor2 = new Visitor(10, 160, 4.00);
    }

    @Test
    public void hasName() {
        assertEquals("Leafy Meadows", park.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(9, park.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, park.getVisitCount());
    }

    @Test
    public void checkVisitorPrice(){
        assertEquals(0.00, park.priceFor(visitor), 0.0);
        assertEquals(0.00, park.priceFor(visitor2), 0.0);
    }


}
