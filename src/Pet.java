import java.util.HashMap;


public abstract class Pet {
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
        this.happiness = this.happiness + i;//set happiness by the intake parameters
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

    public void setBoredom(int i) {
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

    public abstract void setThirst(int change);
    public abstract int getThirst();
    public abstract void changeThirst(int i);
    public abstract void setHunger(int i);
    public abstract int getHunger();
    public abstract void changeHunger(int i);
    public abstract int getBatteryLevel();
    public abstract void setBatteryLevel(int i);
    public abstract int getOilLevel();
    public abstract void setOilLevel(int i);

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
        setCleanliness(20);
    }

    public void polish(){//method to polish a pet(overridden in subclass)

    }

    public void oil(){//method to oil pet(overridden in subclass)

    }

    
}
