import java.util.HashMap;
import java.util.Map;

public class MenuOptions {
    App map = new App();
    HashMap<Integer, Pet> petMap = PetMap.getInstance().referenceData;
    public void mainMenu(){
        System.out.println("Please choose an option below: \n");
        System.out.println("----------------- \n" + 
        "| 1) Intake Pet | \n" + 
        "| 2) Adopt Out  | \n" +
        "| 3) View Pets  | \n" +
        "| 4) Exit       | \n" + 
        "----------------- \n");
    }

    public void intakeMenu(){
        System.out.println("What type of Pet would you like to take in to the shelter?\n");
        System.out.println("--------------");
        System.out.println("| 1) Cat     |");
        System.out.println("| 2) Dog     |");
        System.out.println("| 3) RoboCat |");
        System.out.println("| 4) RoboDog |");
        System.out.println("--------------");
    }

    public void chooseWhatToInteractWithMenu(){
        System.out.print("\nWhat would You like to interact with? :");
        System.out.println("---------------------");
        System.out.println("| 1) Individual Pet |");
        System.out.println("| 2) All Pets       |");
        System.out.println("| 3) Facility       |");
        System.out.println("---------------------");

    }

    public void yesorNo(){
        System.out.println("----------");
        System.out.println("| 1) Yes |");
        System.out.println("| 2) No  |");
        System.out.println("----------");
    }

    public void printAllpets(){
        System.out.println("----------------");
                                System.out.println("--Current Pets--");
                                for(Map.Entry<Integer, Pet> mp: petMap.entrySet()){  
                                    System.out.println(mp.getKey()+ ") "+mp.getValue().getName());  
                                    }
                                    System.out.println("----------------");
    }
}
