package Zoo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZooManager {
    private ArrayList<Animal> animals = new ArrayList<>();
    private HashMap<String, Integer> speciesCount = new HashMap<>();

    public ZooManager() {
        try {
            loadAnimals();
            generateReport();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }

    private void loadAnimals() throws FileNotFoundException {
        Scanner animalScanner = new Scanner(new File("src/resources/arrivingAnimals.txt"));
        Scanner nameScanner = new Scanner(new File("src/resources/animalNames.txt"));

        while (animalScanner.hasNextLine()) {
            String line = animalScanner.nextLine();
            String[] tokens = line.split(",");
            String type = tokens[0].trim();
            String name = nameScanner.nextLine().trim();
            int age = Integer.parseInt(tokens[1].trim());

            switch (type) {
                case "Hyena":
                    animals.add(new Hyena(name, age, "Subspecies"));  // Subspecies is a placeholder, replace as needed
                    break;
                case "Lion":
                    animals.add(new Lion(name, age, "Mane Type"));  // Mane Type is a placeholder, replace as needed
                    break;
                case "Tiger":
                    animals.add(new Tiger(name, age, "Stripe Pattern"));  // Stripe Pattern is a placeholder, replace as needed
                    break;
                case "Bear":
                    animals.add(new Bear(name, age, "Region"));  // Region is a placeholder, replace as needed
                    break;
            }
        }

        animalScanner.close();
        nameScanner.close();
    }

    private void generateReport() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/resources/animalNames.txt"));
        while (scanner.hasNextLine()) {
            String name = scanner.nextLine().trim();
            if (speciesCount.containsKey(name)) {
                speciesCount.put(name, speciesCount.get(name) + 1);
            } else {
                speciesCount.put(name, 1);
            }
        }
        scanner.close();

        // Output report
        for (Map.Entry<String, Integer> entry : speciesCount.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        new ZooManager();
    }
}

