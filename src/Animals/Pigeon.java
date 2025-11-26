package Animals;

public class Pigeon extends Bird {
    private String species;

    public Pigeon() {}

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name) {
        super(name);
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    @Override
    public void eat() {
        System.out.println("Pigeon " + name + " pecks grains.");
    }

    @Override
    public String getVoice() {
        return "Coo! Coo!";
    }

    @Override
    public String toString() {
        return "Pigeon{" + super.toString() + ", species='" + species + "'}";
    }
}
