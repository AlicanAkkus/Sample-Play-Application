package services;

import models.Person;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by wora on 3/6/16.
 */
public class PersonService {


    private HashMap<Integer,Person> personHMap;
    private static PersonService personService = null;

    private PersonService(){
        this.personHMap = new HashMap<>();
    }
    public static PersonService getInstance(){
        if(personService == null)
            personService = new PersonService();

        return personService;
    }

    public void addPerson(Person person){
        this.personHMap.put(person.getId(), person);
    }

    public void deletePerson(int id){

        if(personHMap.containsKey(id)){
            personHMap.remove(id);
        }

    }

    public void updatePerson(Person person) throws Exception{

        if(personHMap.containsKey(person.getId())){
            personHMap.replace(person.getId(), person);
        }else{
            personHMap.put(person.getId(), person);
        }

    }

    public Person getPerson(int id){

        if(personHMap.containsKey(id)){
            return personHMap.get(id);
        }

        return null;
    }

    public HashMap<Integer,Person> getAllPerson(){
        return this.personHMap;
    }

    public void removeAll(){
        this.personHMap.clear();
    }


}
