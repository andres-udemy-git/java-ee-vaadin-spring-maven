package callbacks;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("com.udemy.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Article article = new Article("Article1");

        entityManager.persist(article);

        entityManager.getTransaction().commit();

        Article a = entityManager.createQuery("Select a from Article a", Article.class).getResultList().get(0);

        System.out.println(a.getDate());

        entityManager.close();
        entityManagerFactory.close();
    }

}
