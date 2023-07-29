import java.util.HashMap;
import java.util.Map;

public class MenuOptions {
    App map = new App();
    HashMap<Integer, Pet> petMap = PetMap.getInstance().referenceData;
    
    

    public void mainMenu() {
        System.out.println("Please choose an option below: \n");
        System.out.println("----------------- \n" +
                "| 1) Intake Pet | \n" +
                "| 2) Adopt Out  | \n" +
                "| 3) View Pets  | \n" +
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
        
        System.out.println("---------------------------R--E--G--U--L--A--R----P--E--T--S----------------------------------------------------");
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
}
