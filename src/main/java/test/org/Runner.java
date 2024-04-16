package test.org;

import com.google.gson.Gson;
import test.org.creators.UniversityCreator;
import test.org.models.University;

public class Runner {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();

        Gson gson = new Gson();
        String universityJson = gson.toJson(university);
        System.out.println(universityJson);
    }
}
