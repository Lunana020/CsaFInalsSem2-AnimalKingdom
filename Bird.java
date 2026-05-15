public class Bird extends Animal {
    private double wingSpan;
    private boolean canFly;

    // This is the constructor that was missing or mismatched:
    public Bird(String name, int age, String habitat, double wingSpan, boolean canFly) {
        super(name, age, habitat); // This sends the common data to the Animal class
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }

    @Override
    public String makeSound() {
        return "Chirp Chirp";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Wingspan: %.1fm | Can Fly: %b", wingSpan, canFly);
    }
}