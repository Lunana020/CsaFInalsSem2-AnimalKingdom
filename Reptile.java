public class Reptile extends Animal {
    private boolean isColdBlooded;

    public Reptile(String name, int age, String habitat, boolean isColdBlooded) {
        super(name, age, habitat);
        this.isColdBlooded = isColdBlooded;
    }

    @Override
    public String eat() { return getName() + " is swallowing its prey."; }

    @Override
    public String move() { return getName() + " is crawling or slithering."; }

    @Override
    public String makeSound() { return "Hiss..."; }
}