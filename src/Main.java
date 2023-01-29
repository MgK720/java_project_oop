import accommodation.HostelFloor;
import accommodation.Tent;
import accommodationCRUD.HostelFloorCRUD;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        HostelFloor test = new HostelFloor(15, 1980, 200000, "Warsaw", "Olejowa", "3b", 4, 25, false, "fajny budynek", 1, 15, false, false, 500, "Fajny pokoj");
        Tent test2 = new Tent(15, 2011, 200000, "Warsaw","5", true,true,"fajny campsite",4,100,false,true,"Super namiot");
        HostelFloor test3 = new HostelFloor(20, 2011, 200000, "Szczytno", "Olejowa", "3b", 4, 30, false, "fajny budynek", 1, 15, false, false, 500, "Fajny pokoj");
        HostelFloor test4 = new HostelFloor(20, 2011, 200000, "usun", "Olejowa", "3b", 4, 30, false, "fajny budynek", 1, 15, false, false, 500, "Fajny pokoj");
        System.out.println(test);
        System.out.println(test2);
        System.out.println(test3);

        System.out.println(test3.getIds());

        HostelFloorCRUD hostelFloorCRUD = new HostelFloorCRUD();

        hostelFloorCRUD.createHostelFloor(test);
        hostelFloorCRUD.createHostelFloor(test3);
        hostelFloorCRUD.createHostelFloor(test4);

        List<HostelFloor> hostelFloors = hostelFloorCRUD.readAllHostelFloors();
        System.out.println(hostelFloors);

        System.out.println("_________________________________________________");
        HostelFloor readtest1 = hostelFloorCRUD.readHostelFloor(1);
        HostelFloor readtest2 = hostelFloorCRUD.readHostelFloor(2);
        if(readtest1 != null)System.out.println(readtest1);
        if(readtest2 != null)System.out.println(readtest2);
        System.out.println("_________________________________________________");


        int updateAtId = 3;
        HostelFloor hostelFloorToUpdate = null;
        int index = 0;
        if(hostelFloorCRUD.hostelFloorExists(updateAtId)){
            hostelFloorToUpdate = hostelFloorCRUD.readHostelFloor(updateAtId);
            hostelFloorToUpdate.setNumberOfFloors(8);
            index = hostelFloors.indexOf(hostelFloorToUpdate);
            hostelFloorCRUD.updateHostelFloor(index, hostelFloorToUpdate);
        }else {hostelFloorCRUD.printHostelFloorNotFound(updateAtId);}

        int deleteAtId = 1;
        if(hostelFloorCRUD.hostelFloorExists(deleteAtId)){
            //HostelFloor hostelFloorToDelete = hostelFloorCRUD.readHostelFloor(deleteAtId);
            hostelFloorCRUD.deleteHostelFloor(deleteAtId);
            System.out.println(hostelFloors);
            //System.out.println(hostelFloorCRUD.getHostelFloorsID());
        }else {hostelFloorCRUD.printHostelFloorNotFound(deleteAtId);}

        HostelFloor test5 = new HostelFloor(20, 2011, 200000, "usun", "Olejowa", "3b", 4, 30, false, "fajny budynek", 1, 15, false, false, 500, "Fajny pokoj");
        hostelFloorCRUD.createHostelFloor(test5);
        System.out.println(hostelFloors);
        //System.out.println(hostelFloorCRUD.getHostelFloorsID());

        deleteAtId = 2;
            if(hostelFloorCRUD.hostelFloorExists(deleteAtId)){
            hostelFloorCRUD.deleteHostelFloor(deleteAtId);
            //System.out.println(hostelFloors);
        }else {hostelFloorCRUD.printHostelFloorNotFound(deleteAtId);}

        updateAtId = 1;
        if(hostelFloorCRUD.hostelFloorExists(updateAtId)){
            hostelFloorToUpdate = hostelFloorCRUD.readHostelFloor(updateAtId);
            hostelFloorToUpdate.setNumberOfFloors(6);
            index = hostelFloors.indexOf(hostelFloorToUpdate);
            hostelFloorCRUD.updateHostelFloor(index, hostelFloorToUpdate);
        }else {hostelFloorCRUD.printHostelFloorNotFound(updateAtId);}


        int readAtID = 1;
            if(hostelFloorCRUD.hostelFloorExists(readAtID)){
            HostelFloor readtest3 = hostelFloorCRUD.readHostelFloor(readAtID);
            System.out.println(readtest3);
        }else {hostelFloorCRUD.printHostelFloorNotFound(readAtID);}
    }
}