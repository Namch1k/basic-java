package test.org.creators;

import test.org.models.Human;
import test.org.models.Sex;
public class HumanCreator {
    public Human createPerson(String firstName, String lastName, String middleName, Sex gender) {
        Human person = new Human();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setMiddleName(middleName);
        person.setGender(gender);
        return person;
    }
    public  Human createTypicalPerson(){
        return createPerson("Yan", "Sheleh", "Pavlovich", Sex.MALE);
    }
}

