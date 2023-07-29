public class RegularPet extends Pet {
    private int hunger, thirst;

    public RegularPet(String name, String species, int boredom, int health, int cleanliness, int happiness, int hunger,
            int thirst) {
        super(name, species, boredom, health, cleanliness, happiness);

        this.hunger = hunger;
        this.thirst = thirst;

    }

    // get hunger
    public int getHunger() {
        return this.hunger;
    }

    // set hunger
    @Override
    public void setHunger(int change) {
        this.hunger = this.hunger + change;
    }

    // get thirst
    @Override
    public int getThirst() {
        return this.thirst;
    }

    // set thirst
    @Override
    public void setThirst(int change) {
        this.thirst = this.thirst + change;
    }

    public void feed() {
        this.hunger = this.hunger + 10;
    }

}
