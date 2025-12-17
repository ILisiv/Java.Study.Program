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
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public int compareTo(EmployeeTask3 other) {
        int lastNameCompare = this.lastName.compareToIgnoreCase(other.lastName);
        if (lastNameCompare != 0) {
            return lastNameCompare;
        }
        return this.firstName.compareToIgnoreCase(other.firstName);
    }
}
