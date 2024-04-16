package test.org.tests;

import test.org.creators.UniversityCreator;
import test.org.models.University;
import test.org.managers.JsonManager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class UniJsonTest {
    @Test
    public void testUniversitySerialization() {
        String filePath = "../uni.json";

        JsonManager jsonManager = new JsonManager();
        UniversityCreator universityCreator = new UniversityCreator();
        University oldUniversity = universityCreator.createTypicalUniversity();

        jsonManager.writeToJson(oldUniversity, filePath);
        University newUniversity = (University) jsonManager.readFromJson(filePath);

        assertEquals(newUniversity, oldUniversity);
    }
}
