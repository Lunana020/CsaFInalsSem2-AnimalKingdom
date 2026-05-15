public class Reptile extends Animal {
    private String scaleType;
    private boolean isColdBlooded;

    public Reptile(String name, int age, String habitat, String scaleType, boolean isColdBlooded) {
        super(name, age, habitat);
        this.scaleType = scaleType;
        this.isColdBlooded = isColdBlooded;
    }

    @Override
    public String makeSound() { return "Hiss"; }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Scales: %s | Cold Blooded: %b", scaleType, isColdBlooded);
    }
}