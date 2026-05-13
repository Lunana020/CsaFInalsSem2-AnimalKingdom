import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    private List<Animal> zoo;

    public AnimalController() {
        this.zoo = new ArrayList<>();
    }

    public void addMammal(String name, int age, String habitat, String fur) {
        zoo.add(new Mammal(name, age, habitat, fur));
    }

    public void addBird(String name, int age, String habitat, double wing) {
        zoo.add(new Bird(name, age, habitat, wing));
    }

    public void addReptile(String name, int age, String habitat, boolean coldBlooded) {
        zoo.add(new Reptile(name, age, habitat, coldBlooded));
    }

    public List<Animal> getAllAnimals() {
        return zoo;
    }
}