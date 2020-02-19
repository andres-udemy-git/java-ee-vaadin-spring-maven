package joinedTable;

import joinedTable.vehicle.BusJoined;
import joinedTable.vehicle.CarJoined;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App
{

    public static void main(String[] args)
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.udemy.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        CarJoined carJoined = new CarJoined("car", 200);
        BusJoined bus = new BusJoined("bus", 60);

        entityManager.persist(carJoined);
        entityManager.persist(bus);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}