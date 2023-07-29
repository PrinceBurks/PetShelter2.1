public class RoboDog extends Pet {

    public RoboDog(String name, int boredom, int health) {
        super(name, "RoboDog", boredom, health);
    }

    public void oilRoboDog() {
        System.out.println("You oiled the RoboDog.");
        this.health += 5;
    }

    public void playWithRoboDog() {
        System.out.println("You played with the RoboDog.");
        this.boredom -= 5;
        this.health -= 5;
    }

    public void cleanRoboDog() {
        System.out.println("You cleaned the RoboDog.");
        this.health += 5;
    }

    public void walkRoboDog() {
        System.out.println("You walked the RoboDog.");
        this.health -= 5;
    }

    public void chargeRoboDog() {
        System.out.println("You charged the RoboDog.");

        this.health += 5;
    }

    public String toString() {
        return "RoboDog Name: " + this.name + "\tSpecies: " + this.species + "\tBoredom: " + this.boredom + "\tHealth: "
                + this.health;
    }

}