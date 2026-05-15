public class Mammal extends Animal {
    private String furColor;
    private boolean isDomesticated;

    public Mammal(String name, int age, String habitat, String furColor, boolean isDomesticated) {
        super(name, age, habitat);
        this.furColor = furColor;
        this.isDomesticated = isDomesticated;
    }

    @Override
    public String makeSound() { return "Various mammal sounds"; }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Fur: %s | Domestic: %b", furColor, isDomesticated);
    }
}