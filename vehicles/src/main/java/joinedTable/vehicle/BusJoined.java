package joinedTable.vehicle;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class BusJoined extends VehicleJoined {

    private int numberOfPassengers;

    public BusJoined() {}

    public BusJoined(String name, int numberOfPassengers)
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
