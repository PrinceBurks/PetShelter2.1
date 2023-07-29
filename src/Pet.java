public class Pet {
    // declare variables
    public String name;
    public String species;
    public int hunger;
    public int boredom;
    public int thirst;
    public int health;

    // constructor
    public Pet(String name, String species, int boredom, int health) {
        // intake the parameters and set them to the class
        this.name = name;
        this.species = species;

        this.boredom = boredom;

        this.health = health;
        this.hunger = 0;
        this.thirst = 0;
    }

    // method to change health
    public int changeHealth(int change) {
        this.health = this.health + change;
        return health;
    }

    // method to get value of health
    public int getHealth() {
        return health;
    }

    // method to get value of thirst
    public int getThirst() {
        return thirst;
    }

    // method to get value of boredom
    public int getBoredom() {
        return boredom;
    }

    // method to get value of hunger
    public int getHunger() {
        return hunger;
    }

    // method to get name value
    public String getName() {
        return name;
    }

    // method to get species type
    public String getSpecies() {
        return species;
    }

    // tick method to change properties
    public void tick() {
        this.health--;
        this.hunger++;
        this.boredom++;
        this.thirst++;

    }

    public String toString() {
        return "Name: " + name + "\nSpecies: " + species + "\nHunger: " + hunger + "\nBoredom: " + boredom
                + "\nThirst: " + thirst + "\nHealth: " + health;
    }
}
