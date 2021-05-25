package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor, visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(30, 220, 30.00);
        visitor2 = new Visitor(10, 160, 4.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void checkVisitorPrice(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.0);
        assertEquals(8.40, rollerCoaster.priceFor(visitor2), 0.0);
    }

    @Test
    public void checkIfVisitorAllowed(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }
}
