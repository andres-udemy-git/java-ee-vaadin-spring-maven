package tablePerClass.vehicle;

import javax.persistence.Entity;

@Entity
public class CarT extends VehicleT {

    private int speed;

    public CarT() {}

    public CarT(String name, int speed)
    {
        super(name);
        this.speed = speed;
    }

    public void setSpeed(int speed) { this.speed = speed; }

    public int getSpeed() { return speed; }

}
