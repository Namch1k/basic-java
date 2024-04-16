package test.org;

import test.org.models.University;
import test.org.creators.UniversityCreator;

public class Runner {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();
        System.out.println(university.toString());
    }
}
