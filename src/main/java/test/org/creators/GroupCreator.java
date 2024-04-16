package test.org.creators;

import test.org.models.Group;
import test.org.models.Student;

import java.util.ArrayList;
import java.util.List;
public class GroupCreator {

    Group createGroup(int studentCount, int maxCapacity) {
        Group group = new Group();
        StudentCreator studentCreator = new StudentCreator();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(studentCreator.createTypicalStudent());
        }
        group.setStudents(students);
        group.setMaxCapacity(maxCapacity);
        return group;
    }

    Group createTypicalGroup() {
        Group group = createGroup(1, 5);
        return group;
    }

}

