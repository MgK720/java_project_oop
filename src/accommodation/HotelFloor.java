package accommodation;

public class HotelFloor extends Hotel{
    private int numberOfGuests;
    private double floorArea;
    private boolean haveFreeParkingPlace;
    private boolean haveWifi;
    private int pricePerDay;
    private String floorDescription;

    public HotelFloor(
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
            boolean haveFreeParkingPlace,
            boolean haveWifi,
            int pricePerDay,
            String floorDescription) {

        super(areaOfObject, yearOfConstruction, objectPrize, city, road, number, numberOfFloors, numberOfParkingPlaces, isNearbyCenter, description);
        this.numberOfGuests = numberOfGuests;
        this.floorArea = floorArea;
        this.haveFreeParkingPlace = haveFreeParkingPlace;
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
    public boolean isHaveFreeParkingPlace() {
        return haveFreeParkingPlace;
    }

    public void setHaveFreeParkingPlace(boolean haveFreeParkingPlace) {
        this.haveFreeParkingPlace = haveFreeParkingPlace;
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
        return super.toString() + "HostelFloor [numberOfGuests=" + getNumberOfGuests() + ", floorArea=" + getFloorArea() + ", haveFreeParkingPlace=" + isHaveFreeParkingPlace()
                + ", haveWifi=" + isHaveWifi() + ", pricePerDay=" + getPricePerDay() + ", floorDescription=" + getFloorDescription() +"objectStar="+objectStar()+ "]\n";
    }
    public int pricePerWeek(){
        return (int) (getPricePerDay()/getNumberOfGuests() * 7 * (1 - discount));
    }
    @Override
    public int objectStarConditions(){
        int starHotelFloor = 0;
        if(pricePerWeek() < 1000){
            starHotelFloor +=1;
        }
        if(isHaveWifi()){
            starHotelFloor +=1;
        }
        if(isHaveFreeParkingPlace()){
            starHotelFloor +=1;
        }
        return starHotelFloor;
    }
    @Override
    public int objectStar() {
        int conditions = super.objectStarConditions();
        //todo 2 jako stala
        return super.objectStar() + objectStarConditions()+2;
    }
}
