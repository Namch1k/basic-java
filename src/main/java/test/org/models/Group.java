package test.org.models;

import java.util.List;
import java.util.Objects;
public class Group {
    private int maxCapacity;
    List<Student> students;

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "maxCapacity=" + maxCapacity +
                ", students=" + students.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return maxCapacity == group.maxCapacity &&
                students.equals(group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxCapacity, students);
    }
}

