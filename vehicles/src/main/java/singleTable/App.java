package singleTable;

import singleTable.vehicle.Bus;
import singleTable.vehicle.Car;

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

        Car car = new Car("car", 200);
        Bus bus = new Bus("bus", 60);

        entityManager.persist(car);
        entityManager.persist(bus);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}