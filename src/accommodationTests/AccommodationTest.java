package accommodationTests;
import org.junit.Test;
import static org.junit.Assert.*;
import accommodation.*;

public class AccommodationTest {
    @Test
    public void testHostelFloorObjectStar01(){
        //year = 1980, all boolean conditions are false, price per week > 400
        HostelFloor test = new HostelFloor(15, 1995, 200000, "Warsaw", "Olejowa", "3b", 4, 25, false, "fajny budynek", 1, 15, false, false, 500, "Fajny pokoj");
        int actualObjectStar = test.objectStar();
        int expectedObjectStar = 2;
        assertEquals(expectedObjectStar,actualObjectStar);
    }
    @Test
    public void testHostelFloorObjectStar02(){
        //year = 1992, all boolean conditions are false, price per week > 400
        HostelFloor test = new HostelFloor(15, 1992, 200000, "Warsaw", "Olejowa", "3b", 4, 25, false, "fajny budynek", 1, 15, false, false, 500, "Fajny pokoj");
        int actualObjectStar = test.objectStar();
        int expectedObjectStar = 2;
        assertEquals(expectedObjectStar,actualObjectStar);
    }

    @Test
    public void testHostelFloorObjectStar03(){
        //year = 1992, one boolean condition is true, price per week > 400
        HostelFloor test = new HostelFloor(15, 1992, 200000, "Warsaw", "Olejowa", "3b", 4, 25, false, "fajny budynek", 1, 15, true, false, 500, "Fajny pokoj");
        int actualObjectStar = test.objectStar();
        int expectedObjectStar = 3;
        assertEquals(expectedObjectStar,actualObjectStar);
    }
    @Test
    public void testHostelFloorObjectStar04(){
        //year = 2005, one boolean condition is true, price per week > 400
        HostelFloor test = new HostelFloor(15, 2005, 200000, "Warsaw", "Olejowa", "3b", 4, 25, true, "fajny budynek", 1, 15, true, false, 500, "Fajny pokoj");
        int actualObjectStar = test.objectStar();
        int expectedObjectStar = 5;
        assertEquals(expectedObjectStar,actualObjectStar);
    }
    @Test
    public void testHotelFloorObjectStar01(){
        //year = 1980, all boolean conditions are false, price per week > 1000
        HotelFloor test = new HotelFloor(15, 1980, 200000, "Warsaw", "Olejowa", "3b", 4, 25, false, "fajny budynek", 1, 15, false, false, 1000, "Fajny pokoj");
        int actualObjectStar = test.objectStar();
        int expectedObjectStar = 2;
        assertEquals(expectedObjectStar,actualObjectStar);
    }
    @Test
    public void testHotelFloorObjectStar02(){
        //year = 2005, one boolean condition is true, price per week < 1000
        HotelFloor test = new HotelFloor(15, 2005, 200000, "Warsaw", "Olejowa", "3b", 4, 25, true, "fajny budynek", 1, 15, false, false, 100, "Fajny pokoj");
        int actualObjectStar = test.objectStar();
        int expectedObjectStar = 6;
        assertEquals(expectedObjectStar,actualObjectStar);
    }
    @Test
    public void testTentObjectStar01(){
        //year = 1980, all boolean conditions are false, price per week > 300
        Tent test = new Tent(15, 1980, 200000, "Warsaw","5", false,false,"fajny campsite",4,10000,false,false,"Super namiot");
        int actualObjectStar = test.objectStar();
        int expectedObjectStar = 0;
        assertEquals(expectedObjectStar,actualObjectStar);
    }
    @Test
    public void testTentObjectStar02(){
        //year = 1980, two boolean conditions are true, price per week > 300
        Tent test = new Tent(15, 1980, 200000, "Warsaw","5", true,false,"fajny campsite",4,10000,false,true,"Super namiot");
        int actualObjectStar = test.objectStar();
        int expectedObjectStar = 2;
        assertEquals(expectedObjectStar,actualObjectStar);
    }
}
