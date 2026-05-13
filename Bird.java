public class Bird extends Animal {
    private double wingSpan;

    public Bird(String name, int age, String habitat, double wingSpan) {
        super(name, age, habitat);
        this.wingSpan = wingSpan;
    }

    @Override
    public String eat() { return getName() + " is pecking at seeds or insects."; }

    @Override
    public String move() { return getName() + " is flying through the sky."; }

    @Override
    public String makeSound() { return "Chirp! Chirp!"; }
}