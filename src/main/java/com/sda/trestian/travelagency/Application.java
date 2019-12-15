package com.sda.trestian.travelagency;

import com.sda.trestian.travelagency.dao.PersonDao;
import com.sda.trestian.travelagency.model.Person;

public class Application {

    public static void main(String[] args) {
        System.out.println("Starting Application");
        PersonDao personDao = new PersonDao();
        Person person = personDao.getPerson(1);
        System.out.println(person.getName());
    }
}
