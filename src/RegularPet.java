public class RegularPet extends Pet {
    private int hunger, thirst;
    

    public RegularPet(String name, String species, int boredom, int health, int cleanliness, int happiness, int hunger, int thirst) {
        super(name, species, boredom, health, cleanliness, happiness);

        this.hunger = hunger;
        this.thirst = thirst;
        
    }

    //get hunger
    public int getHunger(){
        return this.hunger;
    }

    //set hunger
    public void setHunger(int change){
        this.hunger = this.hunger + change;
    }

    //get thirst
    public int getThirst(){
        return this.thirst;
    }

    //set thirst
    public void setThirst(int change){
        this.thirst = this.thirst + change;
    }
    
}
