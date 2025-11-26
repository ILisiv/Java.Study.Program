package Animals;

public class Dog extends Mammal implements AnimalBehavior {

    private String breed;
    public Dog()
    {
        super();
        this.breed = "Default";
    }

    public Dog(String name, int age, double weight, String furColor, String breed)
    {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String name)
    {
        super(name);
        this.breed = "Default";
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
    @Override
    public void sleep()
    {
        System.out.println("Dog " + name + " is sleeping soundly.");
    }

    @Override
    public void eat()
    {
        System.out.println("Dog " + name + " eats dog food.");
    }

    @Override
    public String getVoice()
    {
        return "Woof!";
    }

    @Override
    public void move()
    {
        System.out.println("Dog " + name + " runs happily.");
    }

    @Override
    public String toString()
    {
        return getClass().getSimpleName() +
                "{name='" + name + "', age=" + age +
                ", weight=" + weight +
                ", furColor='" + furColor +
                "', breed='" + breed + "'}";
    }
}
