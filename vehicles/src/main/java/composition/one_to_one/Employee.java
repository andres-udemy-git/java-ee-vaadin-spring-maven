package composition.one_to_one;

import javax.persistence.*;

@Entity
@Table(name = "employee_table")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToOne(mappedBy = "employee")
    private Address address;

    public Employee() {}

    public Employee(String name, Address address)
    {
        this.address = address;
        this.name = name;
        this.address.setEmployee(this);
    }

    public Employee(String name, String street, String number, String postcode, String city)
    {
        this(name, new Address(street, number, postcode, city));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
