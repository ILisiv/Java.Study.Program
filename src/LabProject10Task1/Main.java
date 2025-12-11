package LabProject10Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Debug: show working directory
        System.out.println("Working directory: " + System.getProperty("user.dir"));

        // 1) Path to the file
        Path filePath = Path.of("employees.txt");  // file must be in the working directory

        // Debug: show absolute path and whether file exists
        System.out.println("Looking for file at: " + filePath.toAbsolutePath());
        System.out.println("File exists: " + Files.exists(filePath));

        List<Employee> employees = new ArrayList<>();

        // 2) Read file line by line
        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                System.out.println("Read line " + lineNumber + ": '" + line + "'");

                line = line.trim();
                if (line.isEmpty()) {
                    System.out.println("  -> Skipping empty line");
                    continue;
                }

                String[] parts = line.split("\\s+");
                if (parts.length < 2) {
                    System.out.println("  -> Invalid line (expected first and last name), skipping");
                    continue;
                }

                String firstName = parts[0];
                String lastName = parts[1];

                Employee employee = new Employee(firstName, lastName);
                employees.add(employee);
                System.out.println("  -> Added employee: " + employee);
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }

        // 3) Print the size of the collection
        System.out.println("\nNumber of employees: " + employees.size());

        // 4) Print collection in 3 ways

        System.out.println("\n--- Using classic for loop ---");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.println("\n--- Using enhanced for-each loop ---");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\n--- Using Iterator ---");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }
}


