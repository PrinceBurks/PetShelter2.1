import java.util.HashMap;
import java.util.Map;

public class Facility {//class to hold all the information about a facility
    //declared variables
    private int litterBox;
    private int dogKennels;
    private int facilityHealth;
    private int facilityCleanliness;
    private int trash;
    private int toys;
    private int grass;
    //initialization of Map 
    HashMap<Integer, Pet> petMap = PetMap.getInstance().referenceData;

    //constructor 
    public Facility(int litterBox, int dogKennels, int facilityHealth, int facilityCleanliness, int trash, int toys,
            int grass) {//intake all variables and set them to the class variables
        this.litterBox = litterBox;
        this.dogKennels = dogKennels;
        this.facilityHealth = facilityHealth;
        this.facilityCleanliness = facilityCleanliness;
        this.trash = trash;
        this.toys = toys;
        this.grass = grass;
    }

    public int getLitterBox() {//method to get the litter box
        return this.litterBox;
    }

    public void setLitterBox(int i) {//method to set the litter box and return back to allowed range
        this.litterBox = this.litterBox + i;
        if (this.litterBox > 100) {// set back inside parameters if they go out
            this.litterBox = 100;
            System.out.println("The cats litterBox needs to be emptied");
        } else if (this.litterBox < 0) {
            this.litterBox = 0;

        }
    }

    public int getDogKennels() {//method to get the dogs kennels
        return this.dogKennels;
    }

    public void setDogKennels(int i) {//method to set the dogs kennels and return back to allowed range
        this.dogKennels = this.dogKennels + i;
        if (this.dogKennels > 100) {// set back inside parameters if they go out
            this.dogKennels = 100;
            System.out.println("The dogs kennel needs to be cleaned");
        } else if (this.dogKennels < 0) {
            this.dogKennels = 0;
        }
    }

    public int getFacilityHealth() {//method to get the health of the facility
        return this.facilityHealth;
    }

    public void setFacilityHealth(int i) {//method to set the health of the facility and return back to allowed range
        this.facilityHealth = this.facilityHealth + i;
        if (this.facilityHealth > 100) {// set back inside parameters if they go out
            this.facilityHealth = 100;
        } else if (this.facilityHealth < 0) {
            this.facilityHealth = 0;
            System.out.println("You need to take care of your facility");
        }
    }

    public int getFacilityCleanliness() {//method to get the cleaning of the facility
        return this.facilityCleanliness;
    }

    public void setFacilityCleanliness(int i) {// method to set the cleaning of the facility and return back to allowed range
        this.facilityCleanliness = this.facilityCleanliness + i;
        if (this.facilityCleanliness > 100) {// set back inside parameters if they go out
            this.facilityCleanliness = 100;

        } else if (this.facilityCleanliness < 0) {
            this.facilityCleanliness = 0;
            System.out.println("Your facility is very dirty, please clean it");
        }
    }

    public int getTrash() {//method to get the trash of the facility
        return this.trash;
    }

    public void setTrash(int i) {// method to set the trash of the facility and return back to allowed range
        this.trash = this.trash + i;
        if (this.trash > 100) {// set back inside parameters if they go out
            this.trash = 100;
            System.out.println("Your Facility trash is over flowing");
        } else if (this.trash < 0) {
            this.trash = 0;
        }
    }

    public int getToys() {//method to get the toys of the facility
        return this.toys;
    }

    public void setToys(int i) {//method to set the toys of the facility and return back to allowed range
        this.toys = this.toys + i;
        if (this.toys > 100) {// set back inside parameters if they go out
            this.toys = 100;
            System.out.println("Your Facility has to many toys everywhere, please pick them up");
        } else if (this.toys < 0) {
            this.toys = 0;
        }
    }

    public int getGrass() {//method to get the grass of the facility
        return this.grass;
    }

    public void setGrass(int i) {//method to set the grass of the facility and return back to allowed range
        this.grass = this.grass + i;
        if (this.grass > 100) {// set back inside parameters if they go out
            this.grass = 100;
            System.out.println("Your Facility's grass is to long, the pets cant play");
        } else if (this.grass < 0) {
            this.grass = 0;
        }
    }

    // -----I--N--T--E--R--A--C--T--I--O--N--S-------------//
    public void emptyLitter() {//method to empty the litter box
        setLitterBox(-100);
        setFacilityHealth(10);
        setFacilityCleanliness(7);
    }

    public void cleanKennels() {//method to clean the dogs kennels
        setFacilityHealth(10);
        setFacilityCleanliness(10);
        setDogKennels(-100);
    }

    public void takeTrash() {//method to take the trash of the facility
        setFacilityHealth(7);
        setFacilityCleanliness(5);
        setTrash(-100);
    }

    public void cutGrass() {//method to cut the grass of the facility
        setFacilityHealth(15);
        setFacilityCleanliness(30);
        setGrass(-100);
    }

    public void cleanToys() {//method to clean the toys of the facility
        setFacilityHealth(10);
        setFacilityCleanliness(22);
        setToys(-100);
    }

    public void tick() {//method to tick the facility

        setDogKennels(1);
        setGrass(1);
        setToys(1);
        setTrash(1);
        setLitterBox(1);
        setFacilityHealth(-1);
        setFacilityCleanliness(-1);

        for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {//for each pet in the map
            if (this.facilityHealth < 50 || this.facilityCleanliness < 50) {//if the health or cleanliness of the facility is less than 50 it affects the pets
                mp.getValue().setHappiness(-5);
                mp.getValue().setHealth(-5);
                mp.getValue().setBoredom(5);
                mp.getValue().setOilLevel(-5);
                mp.getValue().setBatteryLevel(-5);
            }
            if (this.litterBox > 75 && mp.getValue().getSpecies().equalsIgnoreCase("cat")) {//if the litter box of the pet is greater than 75 it affects the pets
                mp.getValue().setHappiness(-15);
                mp.getValue().setHealth(-15);
                mp.getValue().setCleanliness(-15);
            }
            if (this.dogKennels > 75 && mp.getValue().getSpecies().equalsIgnoreCase("dog")) {//if the dogs kennels of the pet is greater than 75 it affects
                mp.getValue().setHappiness(-10);
                mp.getValue().setHealth(-10);
                mp.getValue().setCleanliness(-15);
            }
        }
    }
}
