public class Pet {
    // declare variables
    // ?? public int keyValue; 
    private String name;
    private String species;    
    private int boredom;    
    private int health;
    private int cleanliness;

    // constructor
    public Pet(String name, String species, int boredom, int health, int cleanliness, int happiness) {
        // intake the parameters and set them to the class
        this.name = name;
        this.species = species;
        this.boredom = boredom;
        this.health = health;
        this.cleanliness = cleanliness;
    }
    // method to get cleanliness
    public int getCleanliness(){
        return this.cleanliness;
    }

    //method to set Cleanliness
    public void changeCleanliness(int change){
        this.cleanliness = this.cleanliness + change;
    }

    // method to change health
    public int changeHealth(int change) {
        this.health = this.health + change;
        if(this.health > 100){
            this.health = 100;
        }else if (this.health < 0){
            this.health = 0;
            System.out.println(this.name + "'s Health is very low");
        }
        return this.health;
    }

    // method to get value of health
    public int getHealth() {
        return this.health;
    }

    // method to get value of boredom
    public int getBoredom() {
        return this.boredom;
    }

    // method to get name value
    public String getName() {
        return this.name;
    }

    // method to get species type
    public String getSpecies() {
        return this.species;
    }

    //tick method to change properties
    public void tick(){
        this.health--;        
        this.boredom++;      
        
    }
}
