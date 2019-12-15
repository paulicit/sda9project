package com.sda.trestian.travelagency.service;

import com.sda.trestian.travelagency.dao.PersonDao;
import com.sda.trestian.travelagency.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDisplayService {

    private PersonDao personDao = new PersonDao();
    //private CarDao carDao;

    public Person getPerson(int idPerson){
       return personDao.getPerson(idPerson);
    }

//    public List<Person> getAllPersons(){
//        return personDao.getAllPersons();
//    }



    //Get persons with filter in Java Code
//    public List<Person> getPersonsFromCity(String city){
//        List<Person> personsFromCity = new ArrayList<>();
//        for (Person person : personDao.getAllPersons()){
//            if (person.getCity().equals(city)){
//                personsFromCity.add(person);
//            }
//        }
//        return personsFromCity;
//    }

//    public double getAverageAgeForPersons(){
//        int sumAges = 0;
//        List<Person> allPersons = getAllPersons();
//        for (Person person : allPersons){
//            sumAges += person.getAge();
//        }
//
//        return sumAges / allPersons.size();
//    }

}
