package accommodation;

public class campsite extends Accommodation implements IAccomodation {
    private String city;
    private String number;
    private String description;

    public campsite(int idOfAccomodation, double areaOfObject, int yearOfConstruction, double objectPrize, String city, String number, String description) {
        super(idOfAccomodation, areaOfObject, yearOfConstruction, objectPrize);
        this.city = city;
        this.number = number;
        this.description = description;
    }
}
