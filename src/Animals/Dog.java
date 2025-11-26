package Animals;

public class Dog extends Mammal {
    private String breed;

    public Dog() {}

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String name) {
        super(name);
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public void eat() {
        System.out.println("Dog " + name + " eats dog food.");
    }

    @Override
    public String getVoice() {
        return "Woof!";
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + ", breed='" + breed + "'}";
    }
}
