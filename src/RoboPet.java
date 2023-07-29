public class RoboPet extends Pet {
    private int batteryLevel, oilLevel;
    

    public RoboPet(String name, String species, int boredom, int health, int cleanliness, int happiness,
            int batteryLevel, int oilLevel) {
        super(name, species, boredom, health, cleanliness, happiness);
        this.batteryLevel = batteryLevel;
        this.oilLevel = oilLevel;

    }

    //get batteryLevel
    public int getBatteryLevel(){
        return this.batteryLevel;
    }

    //set battery level
    public void setbatteryLevel(int change){
        this.batteryLevel = this.batteryLevel + change;
    }

    //get oil level
    public int oilLevel(){
        return this.oilLevel;
    }

    //set oil level
    public void setOilLevel(int change){
        this.oilLevel = this.oilLevel + change;
    }

    
    public int getThirst(){//return 0 because robo pets dont get thirsty
        return 0;
    }

    public void setThirst(int choice){
        System.out.println("You cannot give water to a RoboPet");
    }

    public void setHunger(int i) {
    }

    public int gethunger(){
        System.out.println("RoboPets cannot eat regular food");
        return 0;
    }
}
