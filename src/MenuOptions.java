import java.util.HashMap;
import java.util.Map;

public class MenuOptions {

    HashMap<Integer, Pet> petMap = PetMap.getInstance().referenceData;//set instance of the pet map

    public void facilityMenu() {
        System.out.println("-----------------------");
        System.out.println("| 1) Clean Litter Box  |");
        System.out.println("| 2) Clean Dog kennels |");
        System.out.println("| 3) Take out Trash    |");
        System.out.println("| 4) Clean up Pet Toys |");
        System.out.println("| 5) Cut the Grass     |");
        System.out.println("| 0) Go Back           |");
        System.out.println("-----------------------");
    }

    public void facilityStats(Facility facility) {//method to print facility stats
        System.out.println("-----------------------------------F--A--C--I--L--I--T--Y--------------------------------------------------");
        System.out.println("|    Health    |    Cleanness   |     litter     |    Kennels    |    trash    |    Toys    |    Grass    |");
        System.out.println("|" + facility.getFacilityHealth()
                + whiteSpace(String.valueOf(facility.getFacilityHealth()).length()) + "  |" +//print facility health and add white space
                facility.getFacilityCleanliness()
                + whiteSpace(String.valueOf(facility.getFacilityCleanliness()).length()) + "    |" +//print cleanliness add white space
                facility.getLitterBox() + whiteSpace(String.valueOf(facility.getLitterBox()).length()) + "    |" +//print litterbox add white space
                facility.getDogKennels() + whiteSpace(String.valueOf(facility.getDogKennels()).length()) + "   |" +//print kennels add white space
                facility.getTrash() + whiteSpace(String.valueOf(facility.getTrash()).length()) + " |" +//print trash get white space
                facility.getToys() + whiteSpace(String.valueOf(facility.getToys()).length()) + "|" +//print toys add white space
                facility.getGrass() + whiteSpace(String.valueOf(facility.getGrass()).length()) + " |");//print grass get white space
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }

    public void mainMenu() {//main menu display
        System.out.println("Please choose an option below: \n");
        System.out.println("----------------- \n" +
                "| 1) Intake Pet | \n" +
                "| 2) Adopt Out  | \n" +
                "| 3) Interact   | \n" +
                "| 4) Exit       | \n" +
                "----------------- \n");
    }

    public void intakeMenu() {//intake menu display
        System.out.println("What type of Pet would you like to take in to the shelter?\n");
        System.out.println("--------------");
        System.out.println("| 1) Cat     |");
        System.out.println("| 2) Dog     |");
        System.out.println("| 3) RoboCat |");
        System.out.println("| 4) RoboDog |");
        System.out.println("--------------");
    }

    public void chooseWhatToInteractWithMenu() {//chose to interact display menu
        System.out.println("\nWhat would You like to interact with? :");
        System.out.println("---------------------");
        System.out.println("| 1) Individual Pet |");
        System.out.println("| 2) All Pets       |");
        System.out.println("| 3) Facility       |");
        System.out.println("---------------------");
    }

    public void yesorNo() {//yes or no prompt display
        System.out.println("----------");
        System.out.println("| 1) Yes |");
        System.out.println("| 2) No  |");
        System.out.println("----------");
    }

    public void printAllpets() {//print keys and names for all pets in map
        System.out.println("----------------");
        System.out.println("--Current Pets--");
        for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {//loop through map and print all keys and names
            System.out.println(mp.getKey() + ") " + mp.getValue().getName());
        }
        System.out.println("----------------");
    }

    public void interactionsList() {//menu for interactions
        System.out.println("---------------------------");
        System.out.println("|  1) Feed   |  6) Polish |");
        System.out.println("|  2) Water  |  7) Walk   |");
        System.out.println("|  3) Pet    |  8) Nap    |");
        System.out.println("|  4) Fetch  |  9) Groom  |");
        System.out.println("|  5) Wash   | 10) Oil    |");
        System.out.println("|       0) Go back        |");
        System.out.println("---------------------------");
    }

    public void petStats(int petKey) {//method to print single pet stats, intakes key for map
        Pet currentPet = petMap.get(petKey);//initialize the current pet, grabbing it by the key 
        String petName = currentPet.getName();//initialize pets name
        //put pet in this list if it is regular pet
        if (currentPet.getSpecies().equalsIgnoreCase("cat") || (currentPet.getSpecies().equalsIgnoreCase("dog"))) {
            System.out.println("---------------------------R--E--G--U--L--A--R----P--E--T--S----------------------------------------------------");
            System.out.println("|    Name    |    Hunger   |    Thirst    |    Health    |    Happiness    |    Cleanliness    |    Boredom    |");
            System.out.println("|" + petName + whiteSpace(petName.length()) + "| " +//print pets name
                    currentPet.getHunger() + whiteSpace(String.valueOf(currentPet.getHunger()).length()) + "|  " +//print hunger add white space
                    currentPet.getThirst() + whiteSpace(String.valueOf(currentPet.getThirst()).length()) + "|  " +//print thirst add white space
                    currentPet.getHealth() + whiteSpace(String.valueOf(currentPet.getHealth()).length()) + "|     " +//print health add white space
                    currentPet.getHappiness() + whiteSpace(String.valueOf(currentPet.getHappiness()).length()) + "|    "//print happiness add white space
                    + currentPet.getCleanliness() + whiteSpace(String.valueOf(currentPet.getCleanliness()).length()) + "   |  " +//print cleanliness add white space
                    currentPet.getBoredom() + whiteSpace(String.valueOf(currentPet.getBoredom()).length()) + " |");//print boredom add white space
                    System.out.println("----------------------------------------------------------------------------------------------------------------");
        } else {//if robo pet add to this list
            System.out.println("-----------------------------------R--O--B--O-----P--E--T--S----------------------------------------------------");
            System.out.println("|    Name    |    Battery   |     Oil     |    Health    |    Happiness    |    Cleanliness    |    Boredom    |");
            System.out.println("|" + petName + whiteSpace(petName.length()) + "| " +//print name add white space
                    currentPet.getBatteryLevel() + whiteSpace(String.valueOf(currentPet.getBatteryLevel()).length()) + "|  " +//print battery add white space
                    currentPet.getOilLevel() + whiteSpace(String.valueOf(currentPet.getOilLevel()).length()) + "|  " +//print oil level add white space
                    currentPet.getHealth() + whiteSpace(String.valueOf(currentPet.getHealth()).length()) + "|     " +//print health add white space
                    currentPet.getHappiness() + whiteSpace(String.valueOf(currentPet.getHappiness()).length()) + "|    " +//print happiness add white space
                    currentPet.getCleanliness() + whiteSpace(String.valueOf(currentPet.getCleanliness()).length()) + "   |  " +//print cleanliness add white space
                    currentPet.getBoredom() + whiteSpace(String.valueOf(currentPet.getBoredom()).length()) + " |");//print boredom add white space
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    
    public void allPetsStats() {//method to print stats for all pets and put them in separate menus
        System.out.println(
                "---------------------------R--E--G--U--L--A--R----P--E--T--S----------------------------------------------------");
        System.out.println(
                "|    Name    |    Hunger   |    Thirst    |    Health    |    Happiness    |    Cleanliness    |    Boredom    |");
        for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {//loop through all pets
            String petName = mp.getValue().getName();//initialize pet name
            if (mp.getValue().getSpecies().equalsIgnoreCase("cat")//put in this menu of pet is cat or dog
                    || (mp.getValue().getSpecies().equalsIgnoreCase("dog"))) {
                System.out.println("|" + petName + whiteSpace(petName.length()) + "| " +//print name and add white space
                        mp.getValue().getHunger() + whiteSpace(String.valueOf(mp.getValue().getHunger()).length())// print hunger and add whit space
                        + "|  " +
                        mp.getValue().getThirst() + whiteSpace(String.valueOf(mp.getValue().getThirst()).length())//print thirst and add white space
                        + "|  " +
                        mp.getValue().getHealth() + whiteSpace(String.valueOf(mp.getValue().getHealth()).length())//print health and add white space
                        + "|     " +
                        mp.getValue().getHappiness() + whiteSpace(String.valueOf(mp.getValue().getHappiness()).length())//print happiness and add white space
                        + "|    " +
                        mp.getValue().getCleanliness()
                        + whiteSpace(String.valueOf(mp.getValue().getCleanliness()).length()) + "   |  " +//print cleanliness and add white space
                        mp.getValue().getBoredom() + whiteSpace(String.valueOf(mp.getValue().getBoredom()).length())//print boredom and add white space
                        + " |");
            }
        }

        System.out.println(
                "-----------------------------------R--O--B--O-----P--E--T--S----------------------------------------------------");
        System.out.println(
                "|    Name    |    Battery   |     Oil     |    Health    |    Happiness    |    Cleanliness    |    Boredom    |");
        for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {//loop through again to find all robo pets
            String petName = mp.getValue().getName();//initialize name
            if (mp.getValue().getSpecies().equalsIgnoreCase("robocat")//add to this menu if is robo pet
                    || (mp.getValue().getSpecies().equalsIgnoreCase("robodog"))) {
                System.out.println("|" + petName + whiteSpace(petName.length()) + "| " +//print name add white space
                        mp.getValue().getBatteryLevel()
                        + whiteSpace(String.valueOf(mp.getValue().getBatteryLevel()).length())//print battery level and add white space
                        + "|  " +
                        mp.getValue().getOilLevel() + whiteSpace(String.valueOf(mp.getValue().getOilLevel()).length())//print oil level and add white space
                        + "|  " +
                        mp.getValue().getHealth() + whiteSpace(String.valueOf(mp.getValue().getHealth()).length())//print health and add white space
                        + "|     " +
                        mp.getValue().getHappiness() + whiteSpace(String.valueOf(mp.getValue().getHappiness()).length())//print happiness and add white space
                        + "|    " +
                        mp.getValue().getCleanliness()
                        + whiteSpace(String.valueOf(mp.getValue().getCleanliness()).length()) + "   |  " +//print cleanliness and add white space
                        mp.getValue().getBoredom() + whiteSpace(String.valueOf(mp.getValue().getBoredom()).length())//print boredom and add white space
                        + " |");
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------");
    }

    public String whiteSpace(int attribute) {// method to add white space to menu options
        int length = 12 - attribute;//set length to be 12 minus the attributes length
        String whiteSpace = "";//initialize the white space
        for (int i = 0; i < +length; i++) {//add a space for each length
            whiteSpace = whiteSpace + " ";
        }
        return whiteSpace;//return the whitespace

    }

    public void tick() {// tick function ran off timer
        for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {// loop through each pet in the map
            // change values for each tick
            mp.getValue().changeHunger(5);
            mp.getValue().changeThirst(5);
            mp.getValue().setHappiness(-5);
            mp.getValue().setHealth(-5);
            mp.getValue().setBoredom(5);
            mp.getValue().setOilLevel(-5);
            mp.getValue().setBatteryLevel(-5);
            // if animal is robo pet then recharge if batter is 0
            if (mp.getValue().getSpecies().equals("robocat") || mp.getValue().getSpecies().equals("robodog")) {
                if (mp.getValue().getBatteryLevel() < 0) {
                    mp.getValue().setBatteryLevel(100);
                }
            }
        }
    }
}
