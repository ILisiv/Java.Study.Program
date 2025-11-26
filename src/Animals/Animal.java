package Animals;

public abstract class Animal implements AnimalMove
{
    protected String name;
    protected int age;
    protected double weight;

    public Animal()
    {
        this.name = "Default";
        this.age = 0;
        this.weight = 0.0;
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0.0;
    }

    public abstract void eat();
    public abstract String getVoice();

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    @Override
    public String toString()
    {
        return getClass().getSimpleName() +
                "{name='" + name + "', age=" + age +
                ", weight=" + weight + "}";
    }
}


