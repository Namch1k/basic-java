package test.org.models;

import java.util.List;
import java.util.Objects;
public class University {
    private String name;
    private Human president;
    private List<Faculty> faculties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getPresident() {
        return president;
    }

    public void setPresident(Human president) {
        this.president = president;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", president=" + president +
                ", faculties=" + faculties +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;
        University that = (University) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(president, that.president) &&
                Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, president, faculties);
    }
}

