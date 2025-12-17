package LabProject10Task3;

public class EmployeeTask3 implements Comparable<EmployeeTask3> {
    private final String firstName;
    private final String lastName;

    public EmployeeTask3(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    @Override
    public int compareTo(EmployeeTask3 other) {
        int last = this.lastName.compareToIgnoreCase(other.lastName);
        if (last != 0) return last;

        int first = this.firstName.compareToIgnoreCase(other.firstName);
        if (first != 0) return first;

        return 0;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}


