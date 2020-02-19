package singleTable.vehicle;

import javax.persistence.*;

@Entity
@Table(name = "vehicles")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    public Vehicle() {}

    public Vehicle(String name)
    {
        this.name = name;
    }

    public void setId(int id) { this.id = id; }

    public int getId() { return id; }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }
}
