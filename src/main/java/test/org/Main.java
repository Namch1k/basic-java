package test.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    private static final String DATABASE_URL = "jdbc:sqlite:src/main/java/test/org/resources/database.db";
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(DATABASE_URL);
            printStudentsBornInMonth(connection, 9);
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printStudentsBornInMonth(Connection connection, int month) throws SQLException {
        String query = "SELECT * FROM students WHERE strftime('%m', birth_date) = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, String.format("%02d", month));
            
            try (ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String lastName = resultSet.getString("last_name");
                    String firstName = resultSet.getString("first_name");
                    String middleName = resultSet.getString("middle_name");
                    String birthDate = resultSet.getString("birth_date");
                    String studentId = resultSet.getString("student_id");
                    System.out.printf("ID: %d, Last Name: %s, First Name: %s, Middle Name: %s, Birth Date: %s, Student ID: %s%n",
                            id, lastName, firstName, middleName, birthDate, studentId);
                }
            }
        }
    }
}