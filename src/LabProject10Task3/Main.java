package LabProject10Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        // Debug info
        System.out.println("Working directory: " + System.getProperty("user.dir"));

        Path filePath = Path.of("employees.txt");
        System.out.println("Looking for file at: " + filePath.toAbsolutePath());
        System.out.println("File exists: " + Files.exists(filePath));

        Set<EmployeeTask3> employees = new TreeSet<>();

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split("\\s+");
                if (parts.length < 2) continue;

                employees.add(new EmployeeTask3(parts[0], parts[1]));
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Size
        System.out.println("\nNumber of employees: " + employees.size());

        // Print using for-each
        System.out.println("\n--- Using enhanced for-each loop ---");
        for (EmployeeTask3 e : employees) {
            System.out.println(e);
        }

        // Print using Iterator
        System.out.println("\n--- Using Iterator ---");
        Iterator<EmployeeTask3> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
