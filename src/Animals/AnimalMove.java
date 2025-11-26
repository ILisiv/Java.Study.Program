package Animals;

public interface AnimalMove {
    default void move() {
        System.out.println("Animal is moving.");
    }
}
