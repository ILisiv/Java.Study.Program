package LabProject10Task2;

import java.util.Objects;

public class EmployeeTask2
{
    private final String firstName;
    private final String lastName;

    public EmployeeTask2(String firstName, String lastName) {
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
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof EmployeeTask2 other)) return false;
        return Objects.equals(firstName, other.firstName)
                && Objects.equals(lastName, other.lastName);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(firstName, lastName);
    }
}
