package Animals;
public abstract class Mammal extends Animal {
    protected String furColor;

    public Mammal() {}

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String name) {
        super(name);
    }

    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }

    @Override
    public String toString() {
        return super.toString() + ", furColor='" + furColor + "'";
    }
}
