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

        System.out.println("Working directory: " + System.getProperty("user.dir"));

        Path filePath = Path.of("employees.txt");
        System.out.println("Looking for file at: " + filePath.toAbsolutePath());
        System.out.println("File exists: " + Files.exists(filePath));

        Set<EmployeeTask3> employees = new TreeSet<>();

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                line = line.trim();

                if (line.isEmpty()) continue;

                String[] parts = line.split("\\s+");
                if (parts.length < 2) continue;

                EmployeeTask3 employee =
                        new EmployeeTask3(parts[0], parts[1]);

                employees.add(employee);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Size
        System.out.println("\nNumber of employees: " + employees.size());

        // Printing methods
        System.out.println("\n--- Using enhanced for-each loop ---");
        for (EmployeeTask3 e : employees) {
            System.out.println(e);
        }

        System.out.println("\n--- Using Iterator ---");
        Iterator<EmployeeTask3> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
