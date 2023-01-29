package accommodation;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

abstract class Accommodation implements IAccommodation {
    private static Set<Integer> ids = new HashSet<>();
    private static final AtomicInteger count = new AtomicInteger(0);
    private int idOfAccomodation;
    private double areaOfObject;
    private int yearOfConstruction;
    private double objectPrize;

    public Accommodation(double areaOfObject, int yearOfConstruction, double objectPrize) {
        idOfAccomodation = count.incrementAndGet();
        this.areaOfObject = areaOfObject;
        this.yearOfConstruction = yearOfConstruction;
        this.objectPrize = objectPrize;
        ids.add(this.idOfAccomodation);
    }

    public int getIdOfAccomodation() {return idOfAccomodation;}

    private void setIdOfAccomodation(int idOfAccomodation) {
        if (ids.contains(idOfAccomodation)) {
            throw new IllegalArgumentException("Id already exist.");
        }
        ids.add(idOfAccomodation);
        this.idOfAccomodation = idOfAccomodation;
    }
    public Set<Integer> getIds(){ return ids;}

    public double getAreaOfObject() {return areaOfObject;}

    public void setAreaOfObject(double areaOfObject) {this.areaOfObject = areaOfObject;}

    public int getYearOfConstruction() {return yearOfConstruction;}

    public void setYearOfConstruction(int yearOfConstruction) {this.yearOfConstruction = yearOfConstruction;}

    public double getObjectPrize() {return objectPrize;}

    public void setObjectPrize(double objectPrize) {this.objectPrize = objectPrize;}

    @Override
    public String toString() {
        return "Accommodation [idOfAccomodation=" + getIdOfAccomodation() + ", areaOfObject=" + getAreaOfObject()
                + ", yearOfConstruction=" + getYearOfConstruction() + ", objectPrize=" + getObjectPrize() + "]\n";
    }
    public boolean isRenovatedFrom1990to2000() {return getYearOfConstruction() >= 1990 && getYearOfConstruction() < 2000;}
    public boolean isRenovatedFrom2000to2010() {return getYearOfConstruction() >= 2000 && getYearOfConstruction() <= 2010;}
    public boolean isRenovatedAbove2010() {return getYearOfConstruction() > 2010;}
    public int objectStar(){
        if(isRenovatedFrom1990to2000()){return 1;}
        else if(isRenovatedFrom2000to2010()){return 2;}
        else if(isRenovatedAbove2010()){return 3;}
        else{return 0;}
    }
    public abstract int objectStarConditions();
}