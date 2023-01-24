package accommodationCRUD;

import accommodation.HotelFloor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelFloorCRUD {
    private List<HotelFloor> hotelFloors;

    public Map<Integer, HotelFloor> getHotelFloorsID() {return hotelFloorsID;}

    private Map<Integer, HotelFloor> hotelFloorsID = new HashMap<>();
    public HotelFloorCRUD() {

        hotelFloors = new ArrayList<HotelFloor>();
    }
    public void createHotelFloor(HotelFloor hotelFloor) {
        hotelFloors.add(hotelFloor);
        hotelFloorsID.put(hotelFloor.getIdOfAccomodation(), hotelFloor);
    }
    public List<HotelFloor> readAllHotelFloors() {
        return hotelFloors;
    }

    public HotelFloor readHotelFloor(int id) {
        if (!hotelFloorsID.containsKey(id)) {
            System.out.println("Hotel floor with id " + id + " does not exist.");
            return null;
        }
        return hotelFloorsID.get(id);
    }
    public void updateHotelFloor(int index, HotelFloor hotelFloor) {
        if (!hotelFloorsID.containsKey(index)) {
            System.out.println("Hotel floor with id " + index + " does not exist.");
            return;
        }
        hotelFloors.set(index, hotelFloor);
    }
    public void deleteHotelFloor(int id) {
        if (!hotelFloorsID.containsKey(id)) {
            System.out.println("Hotel floor with id " + id + " does not exist.");
            return;
        }
        int index = hotelFloors.indexOf(hotelFloorsID.get(id));
        hotelFloorsID.remove(id);
        hotelFloors.remove(index);
    }
}
