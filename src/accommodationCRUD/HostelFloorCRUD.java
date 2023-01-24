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
    public boolean hostelFloorExists(int id) {
        return hostelFloorsID.containsKey(id);
    }
    public void printHostelFloorNotFound(int id) {
        System.out.println("Hostel floor with id " + id + " does not exist.");
    }
    public HostelFloor readHostelFloor(int id) {
        return hostelFloorsID.get(id);
    }
    public void updateHostelFloor(int index, HostelFloor hostelFloor) {
        hostelFloors.set(index, hostelFloor);
    }
    public void deleteHostelFloor(int id) {
        int index = hostelFloors.indexOf(hostelFloorsID.get(id));
        hostelFloorsID.remove(id);
        hostelFloors.remove(index);
    }
}
