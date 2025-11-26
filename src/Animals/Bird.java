package Animals;

public abstract class Bird extends Animal {
    protected String featherColor;

    public Bird() {}

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name) {
        super(name);
    }

    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }

    @Override
    public String toString() {
        return super.toString() + ", featherColor='" + featherColor + "'";
    }
}
