package tablePerClass.vehicle;

import javax.persistence.Entity;

@Entity
public class BusT extends VehicleT {

    private int numberOfPassengers;

    public BusT() {}

    public BusT(String name, int numberOfPassengers)
    {
        super(name);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
