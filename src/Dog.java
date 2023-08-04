public class Dog extends RegularPet {

    public int thirst;

    public Dog(String name, String species, int boredom, int health, int cleanliness, int happiness, int hunger,
            int thirst) {
        super(name, species, boredom, health, cleanliness, happiness, hunger, thirst);
        this.thirst = thirst;

    }
    //---------abstract methods implementation---------//
    //no body because they must be implemented but don't do anything for regular pets
    @Override
    public void setBatteryLevel(int i) {

    }

    @Override
    public int getOilLevel() {
        return 0;
    }

    @Override
    public int getBatteryLevel() {
    return 0;
    }

    @Override
    public void setOilLevel(int i) {

    }
}
