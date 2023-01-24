package accommodationCRUD;

import accommodation.HostelFloor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HostelFloorCRUD {
    private List<HostelFloor> hostelFloors;

    public Map<Integer, HostelFloor> getHostelFloorsID() {return hostelFloorsID;}

    private Map<Integer, HostelFloor> hostelFloorsID = new HashMap<>();
    public HostelFloorCRUD() {

        hostelFloors = new ArrayList<HostelFloor>();
    }
    public void createHostelFloor(HostelFloor hostelFloor) {
        hostelFloors.add(hostelFloor);
        hostelFloorsID.put(hostelFloor.getIdOfAccomodation(), hostelFloor);
    }
    public List<HostelFloor> readAllHostelFloors() {
        return hostelFloors;
    }

    public HostelFloor readHostelFloor(int id) {
        if (!hostelFloorsID.containsKey(id)) {
            System.out.println("Hostel floor with id " + id + " does not exist.");
            return null;
        }
        return hostelFloorsID.get(id);
    }
    public void updateHostelFloor(int index, HostelFloor hostelFloor) {
        if (!hostelFloorsID.containsKey(index)) {
            System.out.println("Hostel floor with id " + index + " does not exist.");
            return;
        }
        hostelFloors.set(index, hostelFloor);
    }
    public void deleteHostelFloor(int id) {
        if (!hostelFloorsID.containsKey(id)) {
            System.out.println("Hostel floor with id " + id + " does not exist.");
            return;
        }
        int index = hostelFloors.indexOf(hostelFloorsID.get(id));
        hostelFloorsID.remove(id);
        hostelFloors.remove(index);
    }
}
