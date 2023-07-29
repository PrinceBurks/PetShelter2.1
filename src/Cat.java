public class Cat extends RegularPet {


    public int thirst;
    
    public Cat(String name, String species, int boredom, int health, int cleanliness, int happiness, int hunger,
            int thirst) {
        super(name, species, boredom, health, cleanliness, happiness, hunger, thirst);
        this.thirst = thirst;
       
    }
    // @Override
    // public void setThirst(int change){
    //     this.thirst = this.thirst + change;
    // }

    // @Override
    // public int getThirst(){
    //     return this.thirst;
    // }
}
