//reptiles
public class reptiles extends Animal{
    //specific variables
    private String scalesColor;
    private boolean isRepitilian;

    //specific constructor
    public reptiles(){
        super();
    }
    public reptiles(String name, int age, String habitat, String color, boolean isReptilian){
        super(name, age, habitat);
        scalesColor = color;
        this.isReptilian = isReptilian;
    }
    //specific methods
}
