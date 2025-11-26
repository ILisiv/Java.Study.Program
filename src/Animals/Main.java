package Animals;

public class Main {
    public static void main(String[] args) {

        Animal[] arr = new Animal[3];

        arr[0] = new Dog("Rex", 5, 25.0, "Brown", "Labrador");
        arr[1] = new Pigeon("Sky", 2, 0.3, "Grey", "Rock Pigeon");
        arr[2] = new Blowfish("Puffy", 1, 1.1, "Saltwater", 8);

        for (Animal a : arr) {
            System.out.println(a);
            a.eat();
            System.out.println("Voice: " + a.getVoice());
            System.out.println();
        }
    }
}
