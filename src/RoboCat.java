public class RoboCat extends Pet {

    public RoboCat(String name, int boredom, int health) {
        super(name, "RoboCat", boredom, health);
    }

    public void oilRoboCat() {
        System.out.println("You oiled the RoboCat.");
        this.health += 5;
    }

    public void playWithRoboCat() {
        System.out.println("You played with the RoboCat.");
        this.boredom -= 5;
        this.health -= 5;
    }

    public void cleanRoboCat() {
        System.out.println("You cleaned the RoboCat.");
        this.health += 5;
    }

    public void walkRoboCat() {
        System.out.println("You walked the RoboCat.");
        this.health -= 5;
    }

    public void chargeRoboCat() {
        System.out.println("You charged the RoboCat.");
        this.health += 5;
    }

    public String toString() {
        return "RoboCat Name: " + this.name + "\tSpecies: " + this.species + "\tBoredom: " + this.boredom + "\tHealth: "
                + this.health;
    }

}
