public class MenuOptions {
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
}
