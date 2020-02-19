package joinedTable.vehicle;

import javax.persistence.*;

@Entity
@Table(name = "vehicle_joined")
@Inheritance(strategy = InheritanceType.JOINED)
public class VehicleJoined {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    public VehicleJoined() {}

    public VehicleJoined(String name)
    {
        this.name = name;
    }

    public void setId(int id) { this.id = id; }

    public int getId() { return id; }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }
}
