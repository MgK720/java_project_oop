package accommodation;

public class Hostel extends Accommodation implements IAccommodation {
    private String city;
    private String road;
    private String number;
    private int numberOfFloors;
    private int numberOfParkingPlaces;
    private boolean isNearbyCenter;
    private String description;
    //todo przerobic na private + metoda get + zastosowanie tego w subklasie
    static final double discount = 0.20;

    public Hostel(
            double areaOfObject,
            int yearOfConstruction,
            double objectPrize,
            String city,
            String road,
            String number,
            int numberOfFloors,
            int numberOfParkingPlaces,
            boolean isNearbyCenter,
            String description) {
        super(areaOfObject, yearOfConstruction, objectPrize);
        this.city = city;
        this.road = road;
        this.number = number;
        this.numberOfFloors = numberOfFloors;
        this.numberOfParkingPlaces = numberOfParkingPlaces;
        this.isNearbyCenter = isNearbyCenter;
        this.description = description;
    }

    public String getCity() {return city;}

    public void setCity(String city) {this.city = city;}

    public String getRoad() {return road;}

    public void setRoad(String road) {this.road = road;}

    public String getNumber() {return number;}

    public void setNumber(String number) {this.number = number;}

    public int getNumberOfFloors() {return numberOfFloors;}

    public void setNumberOfFloors(int numberOfFloors) {this.numberOfFloors = numberOfFloors;}

    public int getNumberOfParkingPlaces() {return numberOfParkingPlaces;}

    public void setNumberOfParkingPlaces(int numberOfParkingPlaces) {this.numberOfParkingPlaces = numberOfParkingPlaces;}
    public boolean getIsNearbyCenter(){return isNearbyCenter;}
    public void setIsNearbyCenter(){this.isNearbyCenter = isNearbyCenter;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    @Override
    public String toString() {
        return super.toString()+ "Hostel [city="
                + getCity() + ", road=" + getRoad() + ", number=" + getNumber() + ", numberOfFloors=" + getNumberOfFloors()
                + ", numberOfParkingPlaces=" + getNumberOfParkingPlaces() +" isNearbyCenter=" + getIsNearbyCenter()+ ", description=" + getDescription() + "]\n";
    }
    public boolean isNumberOfParkingPlacesAbove30(){return getNumberOfParkingPlaces() > 30;}
    public int objectStarConditions(){
        int hostelStar = 0;
        if (isNumberOfParkingPlacesAbove30()){hostelStar += 1;}
        if (getIsNearbyCenter()){hostelStar +=1;}
        return hostelStar;
    }
    @Override
    public int objectStar() {
        int conditions = objectStarConditions();
        return super.objectStar() + conditions;
    }
}


