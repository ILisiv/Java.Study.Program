package Animals;

public class Blowfish extends Fish {
    private int toxicityLevel;

    public Blowfish() {}

    public Blowfish(String name, int age, double weight, String waterType, int toxicityLevel) {
        super(name, age, weight, waterType);
        this.toxicityLevel = toxicityLevel;
    }

    public Blowfish(String name) {
        super(name);
    }

    public int getToxicityLevel() { return toxicityLevel; }
    public void setToxicityLevel(int toxicityLevel) { this.toxicityLevel = toxicityLevel; }

    @Override
    public void eat() {
        System.out.println("Blowfish " + name + " eats small crustaceans.");
    }

    @Override
    public String getVoice() {
        return "(Fish makes no sound)";
    }

    @Override
    public String toString() {
        return "Blowfish{" + super.toString() + ", toxicityLevel=" + toxicityLevel + "}";
    }
}

