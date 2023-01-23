package accommodation;

public class Campsite extends Accommodation implements IAccommodation {
    private String city;
    private String number;
    private boolean isNearbyWater;
    private boolean isNearbyForest;
    private String description;
    static final double discount = 0.25;

    public Campsite(
            double areaOfObject,
            int yearOfConstruction,
            double objectPrize,
            String city,
            String number,
            boolean isNearbyWater,
            boolean isNearbyForest,
            String description) {
        super(areaOfObject, yearOfConstruction, objectPrize);
        this.city = city;
        this.number = number;
        this.isNearbyWater = isNearbyWater;
        this.isNearbyForest = isNearbyForest;
        this.description = description;
    }

    public String getCity() {return city;}

    public void setCity(String city) {this.city = city;}

    public String getNumber() {return number;}

    public void setNumber(String number) {this.number = number;}
    public boolean getIsNearbyWater(){return isNearbyWater;}
    public void setIsNearbyWater(){this.isNearbyWater = isNearbyWater;}
    public boolean getIsNearbyForest(){return isNearbyForest;}
    public void setIsNearbyForest(){this.isNearbyForest = isNearbyForest;}
    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}
    @Override
    public String toString() {
        return super.toString()+ "campsite [city="
                + getCity() + ", number=" + getNumber() +"isNearbyWater=" + getIsNearbyWater()+"isNearbyForest="+getIsNearbyForest()+ ", description=" + getDescription() + "]";
    }
    public int objectStarConditions() {
        int campsiteStar = 0;
        if (getIsNearbyForest()){
            campsiteStar += 1;
        }
        if (getIsNearbyWater()){
            campsiteStar +=1;
        }
        return campsiteStar;
    }

    @Override
    public int objectStar() {return super.objectStar() + objectStarConditions();}
}
