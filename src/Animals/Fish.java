package Animals;

public abstract class Fish extends Animal {
    protected String waterType; // fresh or saltwater

    public Fish() {}

    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    public Fish(String name) {
        super(name);
    }

    public String getWaterType() { return waterType; }
    public void setWaterType(String waterType) { this.waterType = waterType; }

    @Override
    public String toString() {
        return super.toString() + ", waterType='" + waterType + "'";
    }
}
