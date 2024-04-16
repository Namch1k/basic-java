package test.org.models;

import java.util.List;
import java.util.Objects;
public class Department {
    private int maxGroups;
    private List<Group> groups;

    public int getMaxGroups() {
        return maxGroups;
    }

    public void setMaxGroups(int maxGroups) {
        this.maxGroups = maxGroups;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Department{" +
                "maxGroups=" + maxGroups +
                ", groups=" + groups +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return maxGroups == that.maxGroups &&
                groups.equals(that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxGroups, groups);
    }
}

