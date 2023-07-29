public class Cat extends Pet {

    public Cat(String name, int boredom, int health) {
        super(name, "Cat", boredom, health);
    }

    public void cleanLitterBox() {
        System.out.println("You cleaned the litter box.");
        this.health -= 2;
        this.thirst += 5;
        this.hunger += 5;

    }

    public void playWithCat() {
        System.out.println("You played with the cat.");
        this.boredom -= 5;
        this.hunger += 5;
        this.thirst += 5;
    }

    public void feedCat() {
        System.out.println("You fed the cat.");
        this.boredom += 5;
        this.health += 5;
        this.hunger -= 5;
        this.thirst += 5;
    }

    public void waterCat() {
        System.out.println("You gave the cat water.");
        this.health += 5;
        this.thirst -= 5;
    }

    public String toString() {
        return "Cat Name: " + this.name + "\tSpecies: " + this.species + "\tBoredom: " + this.boredom + "\tHealth: "
                + this.health + "\tHunger: " + this.hunger + "\tThirst: " + this.thirst;
    }

}
