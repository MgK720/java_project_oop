package accommodation;

public class Campsite extends Accommodation implements IAccomodation {
    private String city;
    private String number;
    private boolean isNearbyWater;
    private String description;

    public Campsite(int idOfAccomodation, double areaOfObject, int yearOfConstruction, double objectPrize, String city, String number, boolean isNearbyWater, String description) {
        super(idOfAccomodation, areaOfObject, yearOfConstruction, objectPrize);
        this.city = city;
        this.number = number;
        this.isNearbyWater = isNearbyWater;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString()+ "campsite [city="
                + getCity() + ", number=" + getNumber() +"isNearbyWater" + getIsNearbyWater()+ ", description=" + getDescription() + "]";
    }
}
