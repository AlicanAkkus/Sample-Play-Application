package controllers;

import models.Person;
import play.Logger;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.PersonService;
import views.html.person;

import java.util.ArrayList;

/**
 * Created by wora on 3/6/16.
 */
public class PersonController extends Controller {

    private play.Logger.ALogger logger = Logger.of(PersonController.class);

    public Result add(){
        logger.info("Add Person is started..");
        Person person = Form.form(Person.class).bindFromRequest().get();

        PersonService.getInstance().addPerson(person);

        logger.info("Person is saved..");

        return redirect(routes.HomeController.index());
    }

    public Result getPersons(){
        logger.info("get persons method is started..");
        ArrayList<Person> personArrayList = PersonService.getInstance().getAllPerson();
        logger.info("Person list size : "+personArrayList.size());
        return ok(Json.toJson(personArrayList));
    }


    public Result viewPerson(){
        logger.info("get persons method is started..");
        ArrayList<Person> personArrayList = PersonService.getInstance().getAllPerson();
        logger.info("Person list size : "+personArrayList.size());
        return ok(person.render(personArrayList));
    }

    public Result removeAll(){
        logger.info("Remove all person..");
        PersonService.getInstance().removeAll();
        return redirect(routes.HomeController.index());
    }

    public Result delete(String id){
        logger.info("Remove person..");
        PersonService.getInstance().deletePerson(id);
        return redirect(routes.HomeController.index());
    }

}
