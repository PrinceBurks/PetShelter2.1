import java.util.HashMap;

public class Pet {
    // declare variables
    
    private String name;
    private String species;
    private int boredom;
    private int health;
    private int cleanliness;
    private int happiness;
    
    HashMap<Integer, Pet> petMap = PetMap.getInstance().referenceData;

    // constructor
    public Pet(String name, String species, int boredom, int health, int cleanliness, int happiness) {
        // intake the parameters and set them to the class
        this.name = name;
        this.species = species;
        this.boredom = boredom;
        this.health = health;
        this.cleanliness = cleanliness;
        this.happiness = happiness;
    }

    public int getHappiness() {
        return this.happiness;//return happiness level
    }

    public void setHappiness(int i) {//method to set happiness
        this.happiness = this.happiness + i;//set happiness by the intaken parameters
        if (this.happiness > 100) {//set back inside parameters if they go out
            this.happiness = 100;
        } else if (this.happiness < 0) {
            this.happiness = 0;
            System.out.println(getName() + " is very unhappy");
        }
        
    }

    // method to get cleanliness
    public int getCleanliness() {//return cleanliness level
        return this.cleanliness;
    }

    // method to set Cleanliness
    public void setCleanliness(int i) {
        this.cleanliness = this.cleanliness + i;//set cleanliness by the parameters
        if (this.cleanliness > 100) {//set back inside parameters if they go out
            this.cleanliness = 100;
        } else if (this.cleanliness < 0) {
            this.cleanliness = 0;
            System.out.println(getName() + " is very dirty");
        }
        
    }

    // method to change health
    public int setHealth(int change) {
        this.health = this.health + change;
        if (this.health > 100) {//set back inside parameters if they go out
            this.health = 100;
        } else if (this.health < 0) {
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

    private void setBoredom(int i) {
        this.boredom = this.boredom + i;
        if (this.boredom > 100) {//set back inside parameters if they go out
            this.boredom = 100;
            System.out.println(this.name + " is very bored");
        } else if (this.boredom < 0) {
            this.boredom = 0;
            
        }
        
    }

    // method to get name value
    public String getName() {//method to return name of pet
        return this.name;
    }

    // method to get species type
    public String getSpecies() {//method to return species type
        return this.species;
    }

    public void setThirst(int change) {//set empty method so it can be overridden in subclass
    }

    public int getThirst() {//set empty method so it can be overridden in subclass
        return 0;
    }

    public void changeThirst(int i){//set empty method so it can be overridden in subclass
        /*this method exists to allow the setThirst method to be overridden and tell user they cant
         * water robo pet when the water method is ran, but allowing other methods to be ran on roboPets
         * that involve changing thirst and not having the message pop up that you cant water roboPets
         */
    }

    public void setHunger(int i) {//set empty method so it can be overridden in subclass
    }

    public int getHunger() {//set empty method so it can be overridden in subclass
        return 0;
    }
    public void changeHunger(int i){//set empty method so it can be overridden in subclass
        //this method allows for no response when changing hunger off all animals
        //white the set hunger will allow is overridden for the feed method, allowing the
        //code to tell user they can feed a robo animal while allowing other methods
        //to make changes without the alert
    }

    public int getBatteryLevel() {//set empty method so it can be overridden in subclass
        return 0;
    }

    public void setBatteryLevel(int i){//set empty method so it can be overridden in subclass

    }

    public int getOilLevel() {//set empty method so it can be overridden in subclass
        return 0;
    }

    public void setOilLevel(int i){//set empty method so it can be overridden in subclass

    }

    // -----I--N--T--E--R--A--C--T--I--O--N--S-------------//
    public void feed() {//method to feed pets
        setHappiness(5);
        setHealth(2);
        setHunger(-20);
        
    }

    public void water() {//method to water pets
        setHappiness(5);
        setHealth(2);
        setThirst(-20);
    }

    public void pet() {//method to pet a pet
        setHappiness(5);
        setBoredom(-5);
    }

    public void fetch() {//method to play fetch
        setBoredom(-10);
        setHealth(5);
        changeHunger(5);
        changeThirst(5);
        setHappiness(10);
        setBatteryLevel(-10);
        setOilLevel(-5);
        setCleanliness(-20);

    }

    public void wash(){//method to wash pet
        setHealth(5);
        changeHunger(5);
        changeThirst(5);
        setCleanliness(100);
    }

    public void walk(){//method to walk pet
        changeHunger(10);
        changeThirst(10);
        setBoredom(-5);
        setHappiness(10);
        setHealth(5);
        setOilLevel(-5);
        setCleanliness(-10);
    }

    public void nap(){//method to put pet down for nap
        changeHunger(20);
        changeThirst(20);
        setHappiness(25);
        setHealth(10);
        setBoredom(5);
        setOilLevel(-5);
    }

    public void groom(){//method to groom pet
        setHappiness(-25);
        setHealth(15);
        setBoredom(15);
    }

    public void polish(){//method to polish a pet(overridden in subclass)

    }

    public void oil(){//method to oil pet(overridden in subclass)

    }
}
