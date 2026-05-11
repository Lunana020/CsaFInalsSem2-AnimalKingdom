public class Animal {
    /*
    The abstract superclass. Defines common attributes (name, age, habitat) 
    and abstract methods (eat, move, make sound).
     */
    private String name;
    private int age;
    private String habitat;

    public Animal(){

    }
    public Animal(String name, int age, String habitat){
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    //getters 
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String returnHabitat(){
        return habitat;
    }

    //universal methods
    public void eat(){
        System.out.println("The animal eats food");
    }

    public void move(){
        System.out.println("The animal moves.");
    }

    public void makeSound(){
        System.out.println("The animal makes sound.");
    }

}
