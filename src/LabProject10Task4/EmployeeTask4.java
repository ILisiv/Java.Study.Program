package LabProject10Task4;

public class EmployeeTask4 implements Comparable<EmployeeTask4>
{

    private final String firstName;
    private final String lastName;

    public EmployeeTask4(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(EmployeeTask4 other) {
        int lastNameCompare = this.lastName.compareToIgnoreCase(other.lastName);
        if (lastNameCompare != 0) {
            return lastNameCompare;
        }
        return this.firstName.compareToIgnoreCase(other.firstName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
