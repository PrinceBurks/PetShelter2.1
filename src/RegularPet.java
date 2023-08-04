public abstract class RegularPet extends Pet {

    private int hunger, thirst;

    public RegularPet(String name, String species, int boredom, int health, int cleanliness, int happiness, int hunger,
            int thirst) {
        super(name, species, boredom, health, cleanliness, happiness);
                //set passed in parameters to this class
        this.hunger = hunger;
        this.thirst = thirst;

    }

    // get hunger
    @Override
    public int getHunger() {
        return this.hunger;
    }

    // set hunger
    @Override // over ridden method, this allows regular pets to change and not roboPets
    public void setHunger(int i) {
        this.hunger = this.hunger + i;// changer hunger from passed in parameter
        if (this.hunger > 100) {
            this.hunger = 100;
            System.out.println(getName() + " is very hungry");
        } else if (this.hunger < 0) {
            this.hunger = 0;
            System.out.println(getName() + " is very Full");
        }

    }

    @Override // over ridden method, this allows regular pets to change and not roboPets
    public void changeHunger(int i) {
        this.hunger = this.hunger + i;
        if (this.hunger > 100) {
            this.hunger = 100;
            System.out.println(getName() + " is very hungry");
        } else if (this.hunger < 0) {
            this.hunger = 0;
            System.out.println(getName() + " is very full");
        }

    }

    // get thirst
    @Override // over ridden method, this allows regular pets to change and not roboPets
    public int getThirst() {
        return this.thirst;
    }

    @Override // over ridden method, this allows regular pets to change and not roboPets
    public void setThirst(int i) {
        this.thirst = this.thirst + i;
        if (this.thirst > 100) {
            this.thirst = 100;
            System.out.println(getName() + " is very thirsty");
        } else if (this.thirst < 0) {
            this.thirst = 0;
            System.out.println(getName() + " is Quenched");
        }
    }

    @Override // over ridden method, this allows regular pets to change and not roboPets
    public void changeThirst(int i) {
        this.thirst = this.thirst + i;
        if (this.thirst > 100) {
            this.thirst = 100;
            System.out.println(getName() + " is very thirsty");
        } else if (this.thirst < 0) {
            this.thirst = 0;
            System.out.println(getName() + " is Quenched");

        }
    }

    @Override // over ridden method to allow it to be ran on regular pets, but train use that
              // they cant do that
    public void polish() {
        System.out.println("You cant polish a regular pet");
    }

    @Override // over ridden method to allow it to be ran on regular pets, but train use that
              // they cant do that
    public void oil() {
        System.out.println("You cant oil a regular Pet");
    }

    
}
