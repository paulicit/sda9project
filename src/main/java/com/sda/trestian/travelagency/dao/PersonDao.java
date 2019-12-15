package com.sda.trestian.travelagency.dao;

import com.sda.trestian.travelagency.model.Person;
import com.sda.trestian.travelagency.util.HiberateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class PersonDao {
    public Person getPerson(int idPerson) {
        Session session = HiberateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        //CRUD OPERATIONS:
        // READ
        Person person = session.get(Person.class, idPerson);
        //INSERT / UPDATE
//        session.saveOrUpdate(person);
        //DELETE
//        session.delete(person);
        //DELETE using query
//        Query<?> query = session.createQuery("delete from Person where isTrainer is false");
//        query.executeUpdate();
//        transaction.commit();
        session.close();
        return person;
    }

    public List<Person> getPersonsFromCity(String city){
        Session session = HiberateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query<Person> query = session.createQuery("from Person where city = ?1");
        query.setParameter(1,city);
        transaction.commit();
        session.close();

        return query.list();
    }
}
