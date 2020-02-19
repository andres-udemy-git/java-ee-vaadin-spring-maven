package composition.one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args)
    {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("com.udemy.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Employee a = new Employee(
                "Andre",
                "Strasse",
                "123",
                "12345",
                "Beispielstadt");

        Employee b = new Employee(
                "Hugo",
                "Strasse",
                "124",
                "12345",
                "Beispielstadt");

        entityManager.persist(a);
        entityManager.persist(a.getAddress());
        entityManager.persist(b);
        entityManager.persist(b.getAddress());

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
