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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Accommodation [idOfAccomodation=" + getIdOfAccomodation() + ", areaOfObject=" + getAreaOfObject()
                + ", yearOfConstruction=" + getYearOfConstruction() + ", objectPrize=" + getObjectPrize() + "] campsite [city="
                + getCity() + ", number=" + getNumber() + ", description=" + getDescription() + "]";
    }
}
