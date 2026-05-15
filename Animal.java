public abstract class Animal {
    protected String name;
    protected int age;
    protected String habitat;

    public Animal(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    // Abstract method: every animal makes a sound, but in their own way
    public abstract String makeSound();

    @Override
    public String toString() {
        return String.format("Name: %s | Age: %d | Habitat: %s", name, age, habitat);
    }
}