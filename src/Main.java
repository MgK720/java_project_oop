import accommodation.HostelFloor;
import accommodation.Tent;
public class Main {
    public static void main(String[] args) {

        HostelFloor test = new HostelFloor(15, 2011, 200000, "Warsaw", "Olejowa", "3b", 4, 30, false, "fajny budynek", 1, 15, false, false, 500, "Fajny pokoj");
        Tent test2 = new Tent(15, 2011, 200000, "Warsaw","5", true,true,"fajny campsite",4,100,false,true,"Super namiot");
        HostelFloor test3 = new HostelFloor(20, 2011, 200000, "Warsaw", "Olejowa", "3b", 4, 30, false, "fajny budynek", 1, 15, false, false, 500, "Fajny pokoj");
        System.out.println(test);
        System.out.println(test2);
        System.out.println(test3);

        System.out.println(test3.getIds());
    }
}