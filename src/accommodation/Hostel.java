package accommodation;

public class Hostel extends Accommodation implements IAccomodation{
    private String city;
    private String road;
    private String number;
    private int numberOfFloors;
    private int numberOfParkingPlaces;
    private boolean isNearbyCenter;
    private String description;

    public Hostel(int idOfAccomodation, double areaOfObject, int yearOfConstruction, double objectPrize, String city, String road, String number, int numberOfFloors, int numberOfParkingPlaces, boolean isNearbyCenter, String description) {
        super(idOfAccomodation, areaOfObject, yearOfConstruction, objectPrize);
        this.city = city;
        this.road = road;
        this.number = number;
        this.numberOfFloors = numberOfFloors;
        this.numberOfParkingPlaces = numberOfParkingPlaces;
        this.isNearbyCenter = isNearbyCenter;
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfParkingPlaces() {
        return numberOfParkingPlaces;
    }

    public void setNumberOfParkingPlaces(int numberOfParkingPlaces) {
        this.numberOfParkingPlaces = numberOfParkingPlaces;
    }
    public boolean getIsNearbyCenter(){
        return isNearbyCenter;
    }
    public void setIsNearbyCenter(){
        this.isNearbyCenter = isNearbyCenter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString()+ "Hostel [city="
                + getCity() + ", road=" + getRoad() + ", number=" + getNumber() + ", numberOfFloors=" + getNumberOfFloors()
                + ", numberOfParkingPlaces=" + getNumberOfParkingPlaces() + ", description=" + getDescription() + "]";
    }

    @Override
    public int objectStar() {
        int hostelStar = 0;

        return super.objectStar() + hostelStar;
    }
}


