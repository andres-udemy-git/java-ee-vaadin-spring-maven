package composition.many_to_many;

import org.hibernate.bytecode.spi.ProxyFactoryFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("com.udemy.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Project p1 = new Project("Project 1");
        Project p2 = new Project("Project 2");
        Project p3 = new Project("Project 3");
        Project p4 = new Project("Project 4");

        Professor prof1 = new Professor("Prof1");
        Professor prof2 = new Professor("Prof2");
        Professor prof3 = new Professor("Prof3");
        Professor prof4 = new Professor("Prof4");

        prof1.addProject(p1);
        p1.addProfessor(prof1);
        prof1.addProject(p2);
        p2.addProfessor(prof1);

        prof2.addProject(p3);
        p3.addProfessor(prof2);
        prof2.addProject(p2);
        p2.addProfessor(prof2);

        prof3.addProject(p1);
        p1.addProfessor(prof3);
        prof3.addProject(p3);
        p3.addProfessor(prof3);

        prof4.addProject(p4);
        p4.addProfessor(prof4);

        entityManager.persist(p1);
        entityManager.persist(p2);
        entityManager.persist(p3);
        entityManager.persist(p4);

        entityManager.persist(prof1);
        entityManager.persist(prof2);
        entityManager.persist(prof3);
        entityManager.persist(prof4);
        entityManager.remove(prof4);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
