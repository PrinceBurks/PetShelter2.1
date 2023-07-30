import java.util.HashMap;
import java.util.Map;

public class MenuOptions {
    
    HashMap<Integer, Pet> petMap = PetMap.getInstance().referenceData;
    
    public void facilityMenu(){
        System.out.println("-----------------------");
        System.out.println("| 1) Clean Litter Box  |");
        System.out.println("| 2) Clean Dog kennels |");
        System.out.println("| 3) Take out Trash    |");
        System.out.println("| 4) Clean up Pet Toys |");
        System.out.println("| 5) Cut the Grass     |");
        System.out.println("| 0) Go Back           |");
        System.out.println("-----------------------");
    }

    public void facilityStats(Facility facility){
            System.out.println("-----------------------------------F--A--C--I--L--I--T--Y----------------------------------------------");
        System.out.println("|    Health    |    Cleanness   |     litter     |    Kennels    |    trash    |    Toys    |    Grass    |"  );
        System.out.println("|" + facility.getFacilityHealth() + whiteSpace(String.valueOf(facility.getFacilityHealth()).length()) + "  |" +
        facility.getFacilityCleanliness() + whiteSpace(String.valueOf(facility.getFacilityCleanliness()).length()) + "    |" +
        facility.getLitterBox() + whiteSpace(String.valueOf(facility.getLitterBox()).length()) + "    |" + 
        facility.getDogKennels() + whiteSpace(String.valueOf(facility.getDogKennels()).length()) + "   |" +
        facility.getTrash() + whiteSpace(String.valueOf(facility.getTrash()).length()) + " |" +
        facility.getToys() + whiteSpace(String.valueOf(facility.getToys()).length()) + "|" +
        facility.getGrass() + whiteSpace(String.valueOf(facility.getGrass()).length()) + " |" );
        
    }
    public void mainMenu() {
        System.out.println("Please choose an option below: \n");
        System.out.println("----------------- \n" +
                "| 1) Intake Pet | \n" +
                "| 2) Adopt Out  | \n" +
                "| 3) Interact   | \n" +
                "| 4) Exit       | \n" +
                "----------------- \n");
    }

    public void intakeMenu() {
        System.out.println("What type of Pet would you like to take in to the shelter?\n");
        System.out.println("--------------");
        System.out.println("| 1) Cat     |");
        System.out.println("| 2) Dog     |");
        System.out.println("| 3) RoboCat |");
        System.out.println("| 4) RoboDog |");
        System.out.println("--------------");
    }

    public void chooseWhatToInteractWithMenu() {
        System.out.println("\nWhat would You like to interact with? :");
        System.out.println("---------------------");
        System.out.println("| 1) Individual Pet |");
        System.out.println("| 2) All Pets       |");
        System.out.println("| 3) Facility       |");
        System.out.println("---------------------");
    }

    public void yesorNo() {
        System.out.println("----------");
        System.out.println("| 1) Yes |");
        System.out.println("| 2) No  |");
        System.out.println("----------");
    }

    public void printAllpets() {
        System.out.println("----------------");
        System.out.println("--Current Pets--");
        for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {
            System.out.println(mp.getKey() + ") " + mp.getValue().getName());
        }
        System.out.println("----------------");
    }

    public void interactionsList(){
        System.out.println("---------------------------");
        System.out.println("|  1) Feed   |  6) Polish |");
        System.out.println("|  2) Water  |  7) Walk   |");
        System.out.println("|  3) Pet    |  8) Nap    |");
        System.out.println("|  4) Fetch  |  9) Groom  |");
        System.out.println("|  5) Wash   | 10) Oil    |");
        System.out.println("|       0) Go back        |");
        System.out.println("---------------------------");
    }

    public void regularPetStats(int petKey){
        Pet currentPet = petMap.get(petKey);
        String petName = currentPet.getName();
        if (currentPet.getSpecies().equalsIgnoreCase("cat") || (currentPet.getSpecies().equalsIgnoreCase("dog"))){
        System.out.println("---------------------------R--E--G--U--L--A--R----P--E--T--S----------------------------------------------------");
        System.out.println("|    Name    |    Hunger   |    Thirst    |    Health    |    Happiness    |    Cleanliness    |    Boredom    |"  );
        System.out.println("|" + petName + whiteSpace(petName.length()) + "| " +
        currentPet.getHunger() + whiteSpace(String.valueOf(currentPet.getHunger()).length()) + "|  " +
        currentPet.getThirst() + whiteSpace(String.valueOf(currentPet.getThirst()).length()) + "|  " +
        currentPet.getHealth() + whiteSpace(String.valueOf(currentPet.getHealth()).length()) + "|     " +
        currentPet.getHappiness() + whiteSpace(String.valueOf(currentPet.getHappiness()).length()) + "|    " +
        currentPet.getCleanliness() + whiteSpace(String.valueOf(currentPet.getCleanliness()).length()) + "   |  " +
        currentPet.getBoredom() + whiteSpace(String.valueOf(currentPet.getBoredom()).length()) + " |");
        }else{
            System.out.println("-----------------------------------R--O--B--O-----P--E--T--S----------------------------------------------------");
        System.out.println("|    Name    |    Battery   |     Oil     |    Health    |    Happiness    |    Cleanliness    |    Boredom    |"  );
        System.out.println("|" + petName + whiteSpace(petName.length()) + "| " +
        currentPet.getBatteryLevel() + whiteSpace(String.valueOf(currentPet.getBatteryLevel()).length()) + "|  " +
        currentPet.getOilLevel() + whiteSpace(String.valueOf(currentPet.getOilLevel()).length()) + "|  " +
        currentPet.getHealth() + whiteSpace(String.valueOf(currentPet.getHealth()).length()) + "|     " +
        currentPet.getHappiness() + whiteSpace(String.valueOf(currentPet.getHappiness()).length()) + "|    " +
        currentPet.getCleanliness() + whiteSpace(String.valueOf(currentPet.getCleanliness()).length()) + "   |  " +
        currentPet.getBoredom() + whiteSpace(String.valueOf(currentPet.getBoredom()).length()) + " |");

        }
    }

    public void roboPetStats(int petKey){
        Pet currentPet = petMap.get(petKey);
        String petName = currentPet.getName();
        
        System.out.println("-----------------------------------R--O--B--O-----P--E--T--S----------------------------------------------------");
        System.out.println("|    Name    |    Hunger   |    Thirst    |    Health    |    Happiness    |    Cleanliness    |    Boredom    |"  );
        System.out.println("|" + petName + whiteSpace(petName.length()) + "| " +
        currentPet.getHunger() + whiteSpace(String.valueOf(currentPet.getHunger()).length()) + "|  " +
        currentPet.getThirst() + whiteSpace(String.valueOf(currentPet.getThirst()).length()) + "|  " +
        currentPet.getHealth() + whiteSpace(String.valueOf(currentPet.getHealth()).length()) + "|     " +
        currentPet.getHappiness() + whiteSpace(String.valueOf(currentPet.getHappiness()).length()) + "|    " +
        currentPet.getCleanliness() + whiteSpace(String.valueOf(currentPet.getCleanliness()).length()) + "   |  " +
        currentPet.getBoredom() + whiteSpace(String.valueOf(currentPet.getBoredom()).length()) + " |");
        
    }
    public String whiteSpace(int attribute) {//method to add white space to menu options 
        int length = 12 - attribute;
        String whiteSpace = "";
        for (int i = 0; i < +length; i++) {
            whiteSpace = whiteSpace + " ";
        }
        return whiteSpace;

    }
    public void tick(){//tick function ran off timer
        for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {//loop through each pet in the map
        //change values for each tick
        mp.getValue().changeHunger(5);
        mp.getValue().changeThirst(5);
        mp.getValue().setHappiness(-5);
        mp.getValue().setHealth(-5);
        mp.getValue().setBoredom(5);
        mp.getValue().setOilLevel(-5);
        mp.getValue().setBatteryLevel(-5);
            //if animal is robo pet then recharge if batter is 0
        if(mp.getValue().getSpecies().equals("robocat") || mp.getValue().getSpecies().equals("robodog")){
            if(mp.getValue().getBatteryLevel() == 0){
            mp.getValue().setBatteryLevel(100);
        }
    }
    }
    }
}
