package accommodation;

public class Hotel extends Accommodation implements IAccomodation {
    private String city;
    private String road;
    private String number;
    private int numberOfFloors;
    private int numberOfParkingPlaces;
    private String description;

    public Hotel(int idOfAccomodation, double areaOfObject, int yearOfConstruction, double objectPrize,String city, String road, String number, int numberOfFloors, int numberOfParkingPlaces, String description) {
        super(idOfAccomodation, areaOfObject, yearOfConstruction, objectPrize);
        this.city = city;
        this.road = road;
        this.number = number;
        this.numberOfFloors = numberOfFloors;
        this.numberOfParkingPlaces = numberOfParkingPlaces;
        this.description = description;
    }
}
