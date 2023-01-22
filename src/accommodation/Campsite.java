package accommodation;

public class Campsite extends Accommodation implements IAccommodation {
    private String city;
    private String number;
    private boolean isNearbyWater;
    private boolean isNearbyForest;
    private String description;

    public Campsite(int idOfAccomodation, double areaOfObject, int yearOfConstruction, double objectPrize, String city, String number, boolean isNearbyWater, boolean isNearbyForest, String description) {
        super(idOfAccomodation, areaOfObject, yearOfConstruction, objectPrize);
        this.city = city;
        this.number = number;
        this.isNearbyWater = isNearbyWater;
        this.isNearbyForest = isNearbyForest;
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public boolean getIsNearbyWater(){
        return isNearbyWater;
    }
    public void setIsNearbyWater(){
        this.isNearbyWater = isNearbyWater;
    }
    public boolean getIsNearbyForest(){
        return isNearbyForest;
    }
    public void setIsNearbyForest(){
        this.isNearbyForest = isNearbyForest;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString()+ "campsite [city="
                + getCity() + ", number=" + getNumber() +"isNearbyWater=" + getIsNearbyWater()+"isNearbyForest="+getIsNearbyForest()+ ", description=" + getDescription() + "]";
    }
    @Override
    public int objectStar() {
        int hostelStar = 0;
        if (getIsNearbyForest()){
            hostelStar += 1;
        }
        if (getIsNearbyWater()){
            hostelStar +=1;
        }
        return super.objectStar() + hostelStar;
    }
}
