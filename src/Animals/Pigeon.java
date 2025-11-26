package Animals;

public class Pigeon extends Bird implements AnimalBehavior
{

    private String species;
    public Pigeon()
    {
        super();
        this.species = "Default";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species)
    {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name)
    {
        super(name);
        this.species = "Default";
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    @Override
    public void sleep()
    {
        System.out.println("Pigeon " + name + " is sleeping on a tree branch.");
    }

    @Override
    public void eat()
    {
        System.out.println("Pigeon " + name + " pecks at grains.");
    }

    @Override
    public String getVoice()
    {
        return "Coo! Coo!";
    }

    @Override
    public void move()
    {
        System.out.println("Pigeon " + name + " flies across the sky.");
    }

    @Override
    public String toString()
    {
        return getClass().getSimpleName() +
                "{name='" + name + "', age=" + age +
                ", weight=" + weight +
                ", featherColor='" + featherColor +
                "', species='" + species + "'}";
    }
}

