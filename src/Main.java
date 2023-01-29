import accommodation.HostelFloor;
import accommodation.Tent;
import accommodationCRUD.HostelFloorCRUD;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        HostelFloor test = new HostelFloor(15, 2015, 200000, "Warsaw", "Olejowa", "3b", 4, 35, true, "fajny budynek", 1, 15, true, false, 30, "Fajny pokoj");
        Tent test2 = new Tent(15, 2011, 200000, "Warsaw","5", true,true,"fajny campsite",4,100,false,true,"Super namiot");
        HostelFloor test3 = new HostelFloor(20, 1980, 200000, "Szczytno", "Olejowa", "3b", 4, 30, false, "fajny budynek", 1, 15, false, false, 500, "Fajny pokoj");
        HostelFloor test4 = new HostelFloor(20, 2011, 200000, "usun", "Olejowa", "3b", 4, 30, false, "fajny budynek", 1, 15, false, false, 500, "Fajny pokoj");

        HostelFloorCRUD hostelFloorCRUD = new HostelFloorCRUD();

        hostelFloorCRUD.createHostelFloor(test);
        hostelFloorCRUD.createHostelFloor(test3);
        hostelFloorCRUD.createHostelFloor(test4);

        System.out.println("_________________________________________________________________________");
        List<HostelFloor> hostelFloors = hostelFloorCRUD.readAllHostelFloors();
        System.out.println("PRINT ALL HOSTEL FLOORS:\n" + hostelFloors);

        System.out.println("_________________________________________________________________________");
        int readAtID = 1;
        if(hostelFloorCRUD.hostelFloorExists(readAtID)){
            HostelFloor readtest = hostelFloorCRUD.readHostelFloor(readAtID);
            System.out.println("READED HOSTEL FLOOR AT INDEX ["+readAtID+"]:\n"+readtest);
        }else {hostelFloorCRUD.printHostelFloorNotFound(readAtID);}
        readAtID = 2;
        if(hostelFloorCRUD.hostelFloorExists(readAtID)){
            HostelFloor readtest = hostelFloorCRUD.readHostelFloor(readAtID);
            System.out.println("READED HOSTEL FLOOR AT INDEX ["+readAtID+"]:\n"+readtest);
        }else {hostelFloorCRUD.printHostelFloorNotFound(readAtID);}
        System.out.println("_________________________________________________________________________");

        int updateAtId = 3;
        HostelFloor hostelFloorToUpdate = null;
        int index = 0;
        if(hostelFloorCRUD.hostelFloorExists(updateAtId)){
            hostelFloorToUpdate = hostelFloorCRUD.readHostelFloor(updateAtId);
            hostelFloorToUpdate.setYearOfConstruction(2022);
            index = hostelFloors.indexOf(hostelFloorToUpdate);
            hostelFloorCRUD.updateHostelFloor(index, hostelFloorToUpdate);
            System.out.println("UPDATED HOSTEL FLOOR AT INDEX ["+updateAtId+"]\n"+hostelFloorToUpdate);
        }else {hostelFloorCRUD.printHostelFloorNotFound(updateAtId);}
        System.out.println("_________________________________________________________________________");

        int deleteAtId = 1;
        if(hostelFloorCRUD.hostelFloorExists(deleteAtId)){
            //HostelFloor hostelFloorToDelete = hostelFloorCRUD.readHostelFloor(deleteAtId);
            hostelFloorCRUD.deleteHostelFloor(deleteAtId);
            System.out.println("FLOOR AT INDEX ["+deleteAtId+"] IS DELETED");
            System.out.println(hostelFloors);
            //System.out.println(hostelFloorCRUD.getHostelFloorsID());
        }else {hostelFloorCRUD.printHostelFloorNotFound(deleteAtId);}
        System.out.println("_________________________________________________________________________");

        HostelFloor test5 = new HostelFloor(20, 2011, 200000, "usun", "Olejowa", "3b", 4, 30, false, "fajny budynek", 1, 15, false, false, 500, "Fajny pokoj");
        hostelFloorCRUD.createHostelFloor(test5);
        System.out.println("ADDED NEW HOSTEL FLOOR, PRINT ALL HOSTEL FLOORS:\n" + hostelFloors);
        //System.out.println(hostelFloorCRUD.getHostelFloorsID());
        System.out.println("_________________________________________________________________________");

        deleteAtId = 2;
            if(hostelFloorCRUD.hostelFloorExists(deleteAtId)){
                hostelFloorCRUD.deleteHostelFloor(deleteAtId);
                System.out.println("FLOOR AT INDEX ["+deleteAtId+"] IS DELETED");
                System.out.println(hostelFloors);
        }else {hostelFloorCRUD.printHostelFloorNotFound(deleteAtId);}

        updateAtId = 1;
        if(hostelFloorCRUD.hostelFloorExists(updateAtId)){
            hostelFloorToUpdate = hostelFloorCRUD.readHostelFloor(updateAtId);
            hostelFloorToUpdate.setNumberOfFloors(6);
            index = hostelFloors.indexOf(hostelFloorToUpdate);
            hostelFloorCRUD.updateHostelFloor(index, hostelFloorToUpdate);
            System.out.println("UPDATED HOSTEL FLOOR AT INDEX ["+updateAtId+"]\n"+hostelFloorToUpdate);
        }else {hostelFloorCRUD.printHostelFloorNotFound(updateAtId);}


        readAtID = 1;
            if(hostelFloorCRUD.hostelFloorExists(readAtID)){
            HostelFloor readtest = hostelFloorCRUD.readHostelFloor(readAtID);
                System.out.println("READED HOSTEL FLOOR AT INDEX ["+readAtID+"]:\n"+readtest);
        }else {hostelFloorCRUD.printHostelFloorNotFound(readAtID);}
    }
}