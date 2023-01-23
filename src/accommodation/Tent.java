package accommodation;

public class Tent extends Campsite{
    private int numberOfGuests;
    private int pricePerDay;
    private boolean haveFreeAdditionalEquipment;
    private boolean haveFreeFood;
    private String tentDescription;

    public Tent(double areaOfObject, int yearOfConstruction, double objectPrize, String city, String number, boolean isNearbyWater, boolean isNearbyForest, String description, int numberOfGuests, int pricePerDay, boolean haveFreeAdditionalEquipment, boolean haveFreeFood, String tentDescription) {
        super(areaOfObject, yearOfConstruction, objectPrize, city, number, isNearbyWater, isNearbyForest, description);
        this.numberOfGuests = numberOfGuests;
        this.pricePerDay = pricePerDay;
        this.haveFreeAdditionalEquipment = haveFreeAdditionalEquipment;
        this.haveFreeFood = haveFreeFood;
        this.tentDescription = tentDescription;
    }
    public int getNumberOfGuests() {return numberOfGuests;}

    public void setNumberOfGuests(int numberOfGuests) {this.numberOfGuests = numberOfGuests;}

    public int getPricePerDay() {return pricePerDay;}

    public void setPricePerDay(int pricePerDay) {this.pricePerDay = pricePerDay;}

    public boolean isHaveFreeAdditionalEquipment() {return haveFreeAdditionalEquipment;}

    public void setHaveFreeAdditionalEquipment(boolean haveFreeAdditionalEquipment) {this.haveFreeAdditionalEquipment = haveFreeAdditionalEquipment;}

    public boolean isHaveFreeFood() {return haveFreeFood;}

    public void setHaveFreeFood(boolean haveFreeFood) {this.haveFreeFood = haveFreeFood;}

    public String getTentDescription() {return tentDescription;}

    public void setTentDescription(String tentDescription) {this.tentDescription = tentDescription;}
    @Override
    public String toString() {
        return super.toString() + "Tent [numberOfGuests=" + getNumberOfGuests() + ", pricePerDay=" + getPricePerDay() + ", haveFreeAdditionalEquipment=" + isHaveFreeAdditionalEquipment()
                + ", haveFreeFood=" + isHaveFreeFood() + ", tentDescription=" + getTentDescription() + ", objectStar="+objectStar()+ "]\n";
    }
    public int pricePerWeek(){return (int) (getPricePerDay()/getNumberOfGuests() * 7 * (1 - discount));}
    public int objectStarConditions() {
        int tentStar = 0;
        if(pricePerWeek() < 300){
            tentStar += 1;
        }
        if (isHaveFreeAdditionalEquipment()){
            tentStar += 1;
        }
        if (isHaveFreeFood()){
            tentStar +=1;
        }
        return tentStar;
    }

    @Override
    public int objectStar() {return super.objectStar() + objectStarConditions();}
}
