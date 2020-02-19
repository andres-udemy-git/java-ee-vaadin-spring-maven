package com.udemy.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.List;

public class App
{

    private static void insert(EntityManager entityManager, List<Person> persons)
    {
        for (Person p : persons)
            entityManager.persist(p);
        entityManager.getTransaction().commit();
    }

    @SuppressWarnings("Unused")
    private static Person read(EntityManager entityManager, int id)
    {
        Person p = entityManager.find(Person.class, id);
        return p;
    }

    private static List<Person> readJPQL(EntityManager entityManager)
    {
        String query = "SELECT p from Person p";
        return entityManager.createQuery(query).getResultList();
    }

    private static List<Person> readNamedQuery(EntityManager entityManager)
    {
        return entityManager.createNamedQuery("person.getAll").getResultList();
    }

    private static void remove(EntityManager entityManager, Person p)
    {
        entityManager.remove(p);
        entityManager.getTransaction().commit();
    }

    public static void main(String[] args)
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.udemy.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Person p1 = new Person("Person1", "person1@person.de");
        Person p2 = new Person("Person2", "person2@person.de");
        List<Person> persons = Arrays.asList(p1, p2);

        insert(entityManager, persons);

        for (Person p : readJPQL(entityManager))
            System.out.println(p);

        for (Person p : readNamedQuery(entityManager))
        {
            System.out.println(p);
            // Funktioniert nicht :(
            remove(entityManager, p);
        }

        entityManager.close();
        entityManagerFactory.close();
    }
}