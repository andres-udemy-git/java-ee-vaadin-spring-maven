package tablePerClass;

import tablePerClass.vehicle.BusT;
import tablePerClass.vehicle.CarT;

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

        CarT carJoined = new CarT("car", 200);
        BusT bus = new BusT("bus", 60);

        entityManager.persist(carJoined);
        entityManager.persist(bus);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}