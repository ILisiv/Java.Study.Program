package LabProject10Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {

        System.out.println("Working directory: " + System.getProperty("user.dir"));

        Path filePath = Path.of("employees.txt");
        System.out.println("Looking for file at: " + filePath.toAbsolutePath());
        System.out.println("File exists: " + Files.exists(filePath));

        List<EmployeeTask4> employees = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(filePath))
        {
            String line;

            while ((line = reader.readLine()) != null)
            {
                line = line.trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split("\\s+");
                if (parts.length < 2) continue;

                employees.add(new EmployeeTask4(parts[0], parts[1]));
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        Collections.sort(employees, Collections.reverseOrder());
        System.out.println("\nNumber of employees (duplicates allowed): " + employees.size());

        System.out.println("\nUsing enhanced for-each loop");
        for (EmployeeTask4 e : employees) {
            System.out.println(e);
        }

        System.out.println("\nUsing Iterator");
        Iterator<EmployeeTask4> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
