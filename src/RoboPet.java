public class RoboPet extends Pet {
    private int batteryLevel, oilLevel;

    public RoboPet(String name, String species, int boredom, int health, int cleanliness, int happiness,
            int batteryLevel, int oilLevel) {
        super(name, species, boredom, health, cleanliness, happiness);
        this.batteryLevel = batteryLevel;
        this.oilLevel = oilLevel;

    }

    // get batteryLevel
    @Override//overridden method allows to run on RoboPets but not regular pets
    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    // set battery level
    @Override//overridden method allows to run on RoboPets but not regular pets
    public void setBatteryLevel(int change) {
        this.batteryLevel = this.batteryLevel + change;
    }

    // get oil level
    public int getOilLevel() {
        return this.oilLevel;
    }

    // set oil level
    @Override//overridden method allows to run on RoboPets but not regular pets
    public void setOilLevel(int i) {
        this.oilLevel = this.oilLevel + i;
        if (this.oilLevel > 100) {
            this.oilLevel = 100;
            System.out.println(getName() + "'s oil is full");
        } else if (this.oilLevel < 0) {
            this.oilLevel = 0;
            System.out.println(getName() + "'s oil is very low");
        }
        
    }

    public int getThirst() {// return 0 because robo pets don't get thirsty
        return 0;
    }

    public void setThirst(int choice) {//override for robo pet to alert user
        System.out.println("You cannot give water to a RoboPet");
    }

    @Override
    public void changeThirst(int i) {

    }

    @Override//override for robo pet to alert user
    public int getHunger() {
        System.out.println("RoboPets cannot eat regular food");
        return 0;
    }

    @Override//override method from super so actions that change for all pets don't affect ROBO if not allowed
    public void changeHunger(int i) {
    }

    // -----I--N--T--E--R--A--C--T--I--O--N--S-------------//
    @Override//override for robo pet to alert user
    public void feed() {
        System.out.println("You cant feed a RoboPet");
    }

    @Override//override for robo pet to alert user
    public void water() {
        System.out.println("You cant give water to a RoboPet");
    }

    @Override//override for robo pet to alert user
    public void wash() {
        System.out.println("You cannot wash a RoboPet");
    }

    @Override//override from super to do these actions on ROBO since they are specific to this type
    public void polish() {
        setHappiness(10);
        setCleanliness(100);
        setHealth(15);
    }

    @Override//override from super to do these actions on ROBO since they are specific to this type
    public void oil() {
        setOilLevel(100);
        setHappiness(10);
        setHealth(50);

    }

}
