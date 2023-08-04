public class RoboDog extends RoboPet {

    public RoboDog(String name, String species, int boredom, int health, int cleanliness, int happiness,
            int batteryLevel, int oilLevel) {
        super(name, species, boredom, health, cleanliness, happiness, batteryLevel, oilLevel);
        
    }
    //---------abstract methods---------//
    //no body because they must be implemented but don't do anything for robo pets
    @Override
    public void setHunger(int i) {
        
    }

    @Override
    public int getThirst() {
        return 0;
    }

}
