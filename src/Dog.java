public class Dog extends Pet {

    public Dog(String name, int boredom, int health) {
        super(name, "Dog", boredom, health);

    }

    public void walkDog() {
        System.out.println("You walked the dog.");
        this.thirst += 5;
        this.health += 5;
        this.hunger += 5;

    }

    public void playFetch() {
        System.out.println("You played fetch with the dog.");
        this.boredom -= 5;
        this.health += 5;
        this.hunger += 5;
        this.thirst += 5;

    }

    public void cleanKennels() {
        System.out.println("You cleaned the kennels.");
        this.health += 5;
        this.hunger += 5;
        this.thirst += 5;

    }

    public void feedDog() {
        System.out.println("You fed the dog.");
        this.health += 5;
        this.hunger -= 5;
        this.thirst += 5;

    }

    public void waterDog() {
        System.out.println("You gave the dog water.");
        this.thirst -= 5;

    }

    public String toString() {
        return "Dog Name: " + this.name + "\tSpecies: " + this.species + "\tBoredom: " + this.boredom + "\tHealth: "
                + this.health + "\tHunger: " + this.hunger + "\tThirst: " + this.thirst;
    }
}
