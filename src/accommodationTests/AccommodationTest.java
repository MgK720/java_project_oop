package accommodationTests;
import org.junit.Test;
import static org.junit.Assert.*;
import accommodation.*;

public class AccommodationTest {
    @Test
    public void testHostelObjectStar01(){
        //year = 1980, all boolean conditions are false, price per week > 400
        HostelFloor test = new HostelFloor(15, 1980, 200000, "Warsaw", "Olejowa", "3b", 4, 25, false, "fajny budynek", 1, 15, false, false, 500, "Fajny pokoj");
        int actualObjectStar = test.objectStar();
        int expectedObjectStar = 1;
        assertEquals(expectedObjectStar,actualObjectStar);
    }
    @Test
    public void testHostelObjectStar02(){
        //year = 1992, all boolean conditions are false, price per week > 400
        HostelFloor test = new HostelFloor(15, 1992, 200000, "Warsaw", "Olejowa", "3b", 4, 25, false, "fajny budynek", 1, 15, false, false, 500, "Fajny pokoj");
        int actualObjectStar = test.objectStar();
        int expectedObjectStar = 2;
        assertEquals(expectedObjectStar,actualObjectStar);
    }

    @Test
    public void testHostelObjectStar03(){
        //year = 1992, one boolean condition is true, price per week > 400
        HostelFloor test = new HostelFloor(15, 1992, 200000, "Warsaw", "Olejowa", "3b", 4, 25, false, "fajny budynek", 1, 15, true, false, 500, "Fajny pokoj");
        int actualObjectStar = test.objectStar();
        int expectedObjectStar = 3;
        assertEquals(expectedObjectStar,actualObjectStar);
    }
}
