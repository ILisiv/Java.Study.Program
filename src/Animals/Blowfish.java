package Animals;

public class Blowfish extends Fish implements AnimalBehavior
{

    private int toxicityLevel;

    public Blowfish()
    {
        super();
        this.toxicityLevel = 0;
    }

    public Blowfish(String name, int age, double weight, String waterType, int toxicityLevel)
    {
        super(name, age, weight, waterType);
        this.toxicityLevel = toxicityLevel;
    }

    public Blowfish(String name)
    {
        super(name);
        this.toxicityLevel = 0;
    }

    public int getToxicityLevel() { return toxicityLevel; }
    public void setToxicityLevel(int toxicityLevel) { this.toxicityLevel = toxicityLevel; }
    @Override

    public void sleep()
    {
        System.out.println("Blowfish " + name + " is resting near the seabed.");
    }

    @Override
    public void eat() {
        System.out.println("Blowfish " + name + " eats small crustaceans.");
    }

    @Override
    public String getVoice() {
        return "(Blowfish makes no sound)";
    }

    // Override default move() from AnimalMove
    @Override
    public void move() {
        System.out.println("Blowfish " + name + " swims slowly.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{name='" + name + "', age=" + age +
                ", weight=" + weight +
                ", waterType='" + waterType +
                "', toxicityLevel=" + toxicityLevel + "}";
    }
}


