package Animals;

public class Main
{
    public static void main(String[] args)
    {

        // ----- 1) Array of Animals -----
        Animal[] animals = new Animal[3];

        animals[0] = new Dog("Rex", 5, 25.0, "Brown", "Labrador");
        animals[1] = new Pigeon("Sky", 2, 0.3, "Grey", "Rock Pigeon");
        animals[2] = new Blowfish("Puffy", 1, 1.1, "Saltwater", 8);

        System.out.println("=== Animal Array ===");
        for (Animal a : animals) {
            System.out.println(a);
            a.eat();
            System.out.println("Voice: " + a.getVoice());
            a.move(); // from AnimalMove
            System.out.println();
        }


        // ----- 2) Array of AnimalBehavior (sleep()) -----
        AnimalBehavior[] behaviors = new AnimalBehavior[3];

        behaviors[0] = new Dog("Milo", 3, 18.0, "Black", "Shepherd");
        behaviors[1] = new Pigeon("Feather", 1, 0.25, "White", "City Pigeon");
        behaviors[2] = new Blowfish("Spike", 2, 1.3, "Saltwater", 5);

        System.out.println("=== Sleep Behavior ===");
        for (AnimalBehavior b : behaviors) {
            b.sleep();
        }
        System.out.println();


        // ----- 3) Static method from AnimalName -----
        System.out.println("=== Static AnimalName Method ===");
        for (Animal a : animals)
        {
            AnimalName.name(a.getName());
        }
    }
}
