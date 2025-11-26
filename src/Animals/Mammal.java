package Animals;

public abstract class Mammal extends Animal
{

    protected String furColor;
    public Mammal()
    {
        super();
        this.furColor = "Default";
    }
    public Mammal(String name, int age, double weight, String furColor)
    {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String name)
    {
        super(name);
        this.furColor = "Default";
    }

    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }
    @Override
    public String toString()
    {
        return getClass().getSimpleName() +
                "{name='" + name + "', age=" + age +
                ", weight=" + weight +
                ", furColor='" + furColor + "'}";
    }
}

