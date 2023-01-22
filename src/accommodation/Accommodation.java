package accommodation;
public class Accommodation  {
    private int idOfAccomodation;
    private double areaOfObject;
    private int yearOfConstruction;
    private double objectPrize;

    public Accommodation(int idOfAccomodation, double areaOfObject, int yearOfConstruction, double objectPrize) {
        this.idOfAccomodation = idOfAccomodation;
        this.areaOfObject = areaOfObject;
        this.yearOfConstruction = yearOfConstruction;
        this.objectPrize = objectPrize;
    }

    public int getIdOfAccomodation() {
        return idOfAccomodation;
    }

    public void setIdOfAccomodation(int idOfAccomodation) {
        this.idOfAccomodation = idOfAccomodation;
    }

    public double getAreaOfObject() {
        return areaOfObject;
    }

    public void setAreaOfObject(double areaOfObject) {
        this.areaOfObject = areaOfObject;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public double getObjectPrize() {
        return objectPrize;
    }

    public void setObjectPrize(double objectPrize) {
        this.objectPrize = objectPrize;
    }

    @Override
    public String toString() {
        return "Accommodation [idOfAccomodation=" + getIdOfAccomodation() + ", areaOfObject=" + getAreaOfObject()
                + ", yearOfConstruction=" + getYearOfConstruction() + ", objectPrize=" + getObjectPrize() + "]";
    }
}