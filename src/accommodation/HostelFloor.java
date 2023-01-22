package accommodation;

public class HostelFloor extends Hostel{
    private int numberOfGuests;
    private double floorArea;
    private boolean havePrivateBathroom;
    private boolean haveWifi;
    private int pricePerDay;
    private String floorDescription;

    public HostelFloor(
            int idOfAccomodation,
            double areaOfObject,
            int yearOfConstruction,
            double objectPrize,
            String city,
            String road,
            String number,
            int numberOfFloors,
            int numberOfParkingPlaces,
            boolean isNearbyCenter,
            String description,
            int numberOfGuests,
            double floorArea,
            boolean havePrivateBathroom,
            boolean haveWifi,
            int pricePerDay,
            String floorDescription) {

        super(idOfAccomodation, areaOfObject, yearOfConstruction, objectPrize, city, road, number, numberOfFloors, numberOfParkingPlaces, isNearbyCenter, description);
        this.numberOfGuests = numberOfGuests;
        this.floorArea = floorArea;
        this.havePrivateBathroom = havePrivateBathroom;
        this.haveWifi = haveWifi;
        this.pricePerDay = pricePerDay;
        this.floorDescription = floorDescription;
    }
    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public double getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(double floorArea) {
        this.floorArea = floorArea;
    }

    public boolean isHavePrivateBathroom() {
        return havePrivateBathroom;
    }

    public void setHavePrivateBathroom(boolean havePrivateBathroom) {
        this.havePrivateBathroom = havePrivateBathroom;
    }

    public boolean isHaveWifi() {
        return haveWifi;
    }

    public void setHaveWifi(boolean haveWifi) {
        this.haveWifi = haveWifi;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getFloorDescription() {
        return floorDescription;
    }

    public void setFloorDescription(String floorDescription) {
        this.floorDescription = floorDescription;
    }

    @Override
    public String toString() {
        return super.toString() + " HostelFloor [numberOfGuests=" + getNumberOfGuests() + ", floorArea=" + getFloorArea() + ", havePrivateBathroom=" + isHavePrivateBathroom()
                + ", haveWifi=" + isHaveWifi() + ", pricePerDay=" + getPricePerDay() + ", floorDescription=" + getFloorDescription() + "]";
    }
    public int pricePerWeek(){
        return (int) (getPricePerDay()/getNumberOfGuests() * 7 * (1 - discount));
    }
    @Override
    public int objectStarConditions(){
        int starHostelFloor = 0;
        if(pricePerWeek() < 400){
            starHostelFloor +=1;
        }
        if(isHaveWifi()){
            starHostelFloor +=1;
        }
        if(isHavePrivateBathroom()){
            starHostelFloor +=1;
        }
        return starHostelFloor;
    }
    @Override
    public int objectStar() {
        return super.objectStar() + objectStarConditions()+1;
    }
}
