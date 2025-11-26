package Animals;

public abstract class Fish extends Animal {

    protected String waterType; // e.g. "freshwater", "saltwater"

    public Fish()
    {
        super();
        this.waterType = "Default";
    }

    public Fish(String name, int age, double weight, String waterType)
    {
        super(name, age, weight);
        this.waterType = waterType;
    }

    public Fish(String name)
    {
        super(name);
        this.waterType = "Default";
    }

    public String getWaterType() { return waterType; }
    public void setWaterType(String waterType) { this.waterType = waterType; }

    @Override
    public String toString()
    {
        return getClass().getSimpleName() +
                "{name='" + name + "', age=" + age +
                ", weight=" + weight +
                ", waterType='" + waterType + "'}";
    }
}
