public abstract class Animal {
    private String name;
    private int age;
    private String habitat;

    public Animal(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    // Abstract methods: Subclasses MUST implement these
    public abstract String eat();
    public abstract String move();
    public abstract String makeSound();

    // Getters for the Controller/UI
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getHabitat() { return habitat; }

    @Override
    public String toString() {
        return String.format("[%s] Name: %s, Age: %d, Habitat: %s", 
                this.getClass().getSimpleName(), name, age, habitat);
    }
}