package test.org.models;

import java.util.List;
import java.util.Objects;
public class Faculty extends Object {
    private Human dean;
    private int maxDepartments;
    private List<Department> departments;

    public Human getDean() {
        return dean;
    }

    public void setDean(Human dean) {
        this.dean = dean;
    }

    public int getMaxDepartments() {
        return maxDepartments;
    }

    public void setMaxDepartments(int maxDepartments) {
        this.maxDepartments = maxDepartments;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "dean=" + dean +
                ", maxDepartments=" + maxDepartments +
                ", departments=" + departments +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty)) return false;
        Faculty faculty = (Faculty) o;
        return maxDepartments == faculty.maxDepartments &&
                dean.equals(faculty.dean) &&
                departments.equals(faculty.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dean, maxDepartments, departments);
    }
}

