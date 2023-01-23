package accommodationCRUD;

import accommodation.HostelFloor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HostelFloorCRUD {
    private List<HostelFloor> hostelFloors;
    private Map<Integer, HostelFloor> hostelFloorsID = new HashMap<>();
    public HostelFloorCRUD() {

        hostelFloors = new ArrayList<HostelFloor>();
    }
    public void createHostelFloor(HostelFloor hostelFloor) {
        hostelFloors.add(hostelFloor);
        hostelFloorsID.put(hostelFloor.getIdOfAccomodation(), hostelFloor);

    }
}
