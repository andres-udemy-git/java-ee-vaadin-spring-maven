package tablePerClass.vehicle;

import javax.persistence.*;

@Entity
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class VehicleT {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    private String name;

    public VehicleT() {}

    public VehicleT(String name)
    {
        this.name = name;
    }

    public void setId(int id) { this.id = id; }

    public int getId() { return id; }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }
}
