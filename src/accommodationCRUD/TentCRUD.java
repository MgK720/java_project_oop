package accommodationCRUD;

import accommodation.Tent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TentCRUD {
    private List<Tent> tents;

    public Map<Integer, Tent> getTentsID() {return tentsID;}

    private Map<Integer, Tent> tentsID = new HashMap<>();
    public TentCRUD() {

        tents = new ArrayList<Tent>();
    }
    public void createTent(Tent tent) {
        tents.add(tent);
        tentsID.put(tent.getIdOfAccomodation(), tent);
    }
    public List<Tent> readAllTents() {
        return tents;
    }
    public boolean tentExists(int id) {
        return tentsID.containsKey(id);
    }
    public void printTentNotFound(int id) {
        System.out.println("Tent with id " + id + " does not exist.");
    }

    public Tent readTent(int id) {
        return tentsID.get(id);
    }
    public void updateTent(int index, Tent tent) {
        tents.set(index, tent);
    }
    public void deleteHotelFloor(int id) {
        /*if (!hotelFloorsID.containsKey(id)) {
            return;
        }*/
        int index = tents.indexOf(tentsID.get(id));
        tentsID.remove(id);
        tents.remove(index);
    }
}
