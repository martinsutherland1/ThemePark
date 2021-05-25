package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor, visitor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(30, 220, 30.00);
        visitor2 = new Visitor(10, 160, 4.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void checkVisitorPrice(){
        assertEquals(0.00, playground.priceFor(visitor), 0.0);
        assertEquals(0.00, playground.priceFor(visitor2), 0.0);
    }

    @Test
    public void checkIfVisitorAllowed(){
        assertEquals(true, playground.isAllowedTo(visitor2));
        assertEquals(false, playground.isAllowedTo(visitor));
    }
}
