package composition.one_to_many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("com.udemy.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        University u = new University("HAW Hamburg");

        Student s1 = new Student("Andre");
        Student s2 = new Student("John");

        u.addStudent(s1);
        u.addStudent(s2);

        entityManager.persist(u);
        entityManager.persist(s1);
        entityManager.persist(s2);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
