package joinedTable.vehicle;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class CarJoined extends VehicleJoined {

    private int speed;

    public CarJoined() {}

    public CarJoined(String name, int speed)
    {
        super(name);
        this.speed = speed;
    }

    public void setSpeed(int speed) { this.speed = speed; }

    public int getSpeed() { return speed; }

}
