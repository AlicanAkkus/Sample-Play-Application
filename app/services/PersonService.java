package services;

import models.Person;

import java.util.ArrayList;

/**
 * Created by wora on 3/6/16.
 */
public class PersonService {


    private ArrayList<Person> personList;
    private static PersonService personService = null;

    private PersonService(){
        this.personList = new ArrayList<>();
    }
    public static PersonService getInstance(){
        if(personService == null)
            personService = new PersonService();

        return personService;
    }

    public void addPerson(Person person){
        this.personList.add(person);
    }

    public void deletePerson(String id){
        for(Person person : personList){
            if(person.getId().equalsIgnoreCase(id)){
                personList.remove(person);
                break;
            }
        }
    }

    public void updatePerson(Person person) throws Exception{
        if(personList.contains(person)){
            Person oldPerson = personList.get(personList.indexOf(person));
            Person clonedPerson = (Person) oldPerson.clone();

            clonedPerson.setName(person.getName());
            clonedPerson.setSurname(person.getSurname());
            clonedPerson.setGender(person.getGender());

            personList.set(personList.indexOf(person), clonedPerson);

        }else{
            personList.add(person);
        }
    }

    public Person getPerson(String id){
        Person person = new Person();
        person.setId(id);


        if(personList.contains(person)){
            Person foundedPerson = personList.get(personList.indexOf(person));
            return foundedPerson;
        }else{
            return person;
        }
    }


    public ArrayList<Person> getAllPerson(){
        return this.personList;
    }

    public void removeAll(){
        this.personList.clear();
    }


}
