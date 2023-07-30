import java.util.HashMap;
import java.util.Map;

public class Facility {
    private int litterBox;
    private int dogKennels;
    private int facilityHealth;
    private int facilityCleanliness;
    private int trash;
    private int toys;
    private int grass;

    HashMap<Integer, Pet> petMap = PetMap.getInstance().referenceData;

    public Facility(int litterBox, int dogKennels, int facilityHealth, int facilityCleanliness, int trash, int toys,
            int grass) {
        this.litterBox = litterBox;
        this.dogKennels = dogKennels;
        this.facilityHealth = facilityHealth;
        this.facilityCleanliness = facilityCleanliness;
        this.trash = trash;
        this.toys = toys;
        this.grass = grass;

    }

    public int getLitterBox() {
        return this.litterBox;
    }

    public void setLitterBox(int i) {
        this.litterBox = this.litterBox + i;
        if (this.litterBox > 100) {// set back inside parameters if they go out
            this.litterBox = 100;
            System.out.println("The cats litterBox needs to be emptied");
        } else if (this.litterBox < 0) {
            this.litterBox = 0;

        }
    }

    public int getDogKennels() {
        return this.dogKennels;
    }

    public void setDogKennels(int i) {
        this.dogKennels = this.dogKennels + i;
        if (this.dogKennels > 100) {// set back inside parameters if they go out
            this.dogKennels = 100;
            System.out.println("The dogs kennel needs to be cleaned");
        } else if (this.dogKennels < 0) {
            this.dogKennels = 0;

        }
    }

    public int getFacilityHealth() {
        return this.facilityHealth;
    }

    public void setFacilityHealth(int i) {
        this.facilityHealth = this.facilityHealth + i;
        if (this.facilityHealth > 100) {// set back inside parameters if they go out
            this.facilityHealth = 100;

        } else if (this.facilityHealth < 0) {
            this.facilityHealth = 0;
            System.out.println("You need to take care of your facility");
        }
    }

    public int getFacilityCleanliness() {
        return this.facilityCleanliness;
    }

    public void setFacilityCleanliness(int i) {
        this.facilityCleanliness = this.facilityCleanliness + i;
        if (this.facilityCleanliness > 100) {// set back inside parameters if they go out
            this.facilityCleanliness = 100;

        } else if (this.facilityCleanliness < 0) {
            this.facilityCleanliness = 0;
            System.out.println("Your facility is very dirty, please clean it");
        }
    }

    public int getTrash() {
        return this.trash;
    }

    public void setTrash(int i) {
        this.trash = this.trash + i;
        if (this.trash > 100) {// set back inside parameters if they go out
            this.trash = 100;
            System.out.println("Your Facility trash is over flowing");
        } else if (this.trash < 0) {
            this.trash = 0;

        }
    }

    public int getToys() {
        return this.toys;
    }

    public void setToys(int i) {
        this.toys = this.toys + i;
        if (this.toys > 100) {// set back inside parameters if they go out
            this.toys = 100;
            System.out.println("Your Facility has to many toys everywhere, please pick them up");
        } else if (this.toys < 0) {
            this.toys = 0;

        }
    }

    public int getGrass() {
        return this.grass;
    }

    public void setGrass(int i) {
        this.grass = this.grass + i;
        if (this.grass > 100) {// set back inside parameters if they go out
            this.grass = 100;
            System.out.println("Your Facility's grass is to long, the pets cant play");
        } else if (this.grass < 0) {
            this.grass = 0;

        }
    }

    // -----I--N--T--E--R--A--C--T--I--O--N--S-------------//
    public void emptyLitter() {
        setLitterBox(-100);
        setFacilityHealth(10);
        setFacilityCleanliness(7);
    }

    public void cleanKennels() {
        setFacilityHealth(10);
        setFacilityCleanliness(10);
        setDogKennels(-100);
    }

    public void takeTrash() {
        setFacilityHealth(7);
        setFacilityCleanliness(5);
        setTrash(-100);
    }

    public void cutGrass() {
        setFacilityHealth(15);
        setFacilityCleanliness(30);
        setGrass(-100);
    }

    public void cleanToys() {
        setFacilityHealth(10);
        setFacilityCleanliness(22);
        setToys(-100);
    }

    public void tick() {

        setDogKennels(1);
        setGrass(1);
        setToys(1);
        setTrash(1);
        setLitterBox(1);
        setFacilityHealth(-1);
        setFacilityCleanliness(-1);

        for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {
            if (this.facilityHealth < 50 || this.facilityCleanliness < 50) {
                mp.getValue().setHappiness(-5);
                mp.getValue().setHealth(-5);
                mp.getValue().setBoredom(5);
                mp.getValue().setOilLevel(-10);
                mp.getValue().setBatteryLevel(-10);
            }
            if (this.litterBox > 75 && mp.getValue().getSpecies().equalsIgnoreCase("cat")) {
                mp.getValue().setHappiness(-15);
                mp.getValue().setHealth(-15);
                mp.getValue().setCleanliness(-15);
            }
            if (this.dogKennels > 75 && mp.getValue().getSpecies().equalsIgnoreCase("dog")) {
                mp.getValue().setHappiness(-10);
                mp.getValue().setHealth(-10);
                mp.getValue().setCleanliness(-15);
            }

        }
    }
}
