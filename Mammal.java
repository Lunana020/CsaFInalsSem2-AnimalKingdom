public class Mammal extends Animal {
    private String furColor;

    public Mammal(String name, int age, String habitat, String furColor) {
        super(name, age, habitat);
        this.furColor = furColor;
    }

    @Override
    public String eat() { return getName() + " is nursing or eating solids."; }

    @Override
    public String move() { return getName() + " is walking/running on limbs."; }

    @Override
    public String makeSound() { return "Mammal vocalization!"; }
}   