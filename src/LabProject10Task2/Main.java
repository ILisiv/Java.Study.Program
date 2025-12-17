package LabProject10Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Working directory: " + System.getProperty("user.dir"));

        Path filePath = Path.of("employees.txt");
        System.out.println("Looking for file at: " + filePath.toAbsolutePath());
        System.out.println("File exists: " + Files.exists(filePath));

        Set<EmployeeTask2> employees = new HashSet<>();

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

                EmployeeTask2 employee = new EmployeeTask2(firstName, lastName);

                boolean added = employees.add(employee);
                if (added) {
                    System.out.println("  -> Added employee: " + employee);
                } else {
                    System.out.println("  -> Duplicate found, skipping: " + employee);
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\nNumber of UNIQUE employees: " + employees.size());

        // Because Set has no index, convert once for classic for-loop printing
        List<EmployeeTask2> listView = new ArrayList<>(employees);

        System.out.println("\n--- Using classic for loop (via List view) ---");
        for (int i = 0; i < listView.size(); i++) {
            System.out.println(listView.get(i));
        }

        System.out.println("\n--- Using enhanced for-each loop (Set) ---");
        for (EmployeeTask2 employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\n--- Using Iterator (Set) ---");
        Iterator<EmployeeTask2> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // contains() demo
        EmployeeTask2 sample = new EmployeeTask2("Ilya", "Volkov");
        System.out.println("\nContains '" + sample + "'? " + employees.contains(sample));
    }
}
