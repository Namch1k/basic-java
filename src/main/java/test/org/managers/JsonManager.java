package test.org.managers;

import com.google.gson.Gson;
import test.org.models.University;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {
    public void writeToJson(Object o, String filePath) {
        Gson gson = new Gson();
        String json = gson.toJson(o);

        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(json);
            writer.close();

            System.out.println("Successful!");
        } catch (IOException error) {
            System.out.println("Error" + error);
            error.printStackTrace();
        }
    }

    public Object readFromJson(String filePath) {
        Gson gson = new Gson();

        try {
            return gson.fromJson(new FileReader(filePath), University.class);
        } catch (FileNotFoundException error) {
            System.out.println("Error" + error);
            error.printStackTrace();
        }

        return null;
    }
}
