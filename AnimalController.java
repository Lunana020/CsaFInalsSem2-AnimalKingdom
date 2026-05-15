import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    private List<Animal> zoo;

    public AnimalController() {
        this.zoo = new ArrayList<>();
    }

    public void addMammal(String n, int a, String h, String f, boolean d) {
        zoo.add(new Mammal(n, a, h, f, d));
    }

    public void addBird(String n, int a, String h, double w, boolean f) {
        zoo.add(new Bird(n, a, h, w, f));
    }

    public void addReptile(String n, int a, String h, String s, boolean c) {
        zoo.add(new Reptile(n, a, h, s, c));
    }

    public List<Animal> getAllAnimals() {
        return zoo;
    }
}