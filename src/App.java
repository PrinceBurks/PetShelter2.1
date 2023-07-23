import java.util.Scanner;

public class App{
    public static void main(String[] args) {
MenuOptions menu = new MenuOptions();
Scanner input = new Scanner(System.in);


boolean gameLoop = true;
        //call start menu
        do{
        menu.mainMenu();//runs main menu to ask user what they want to do 
        int mainMenuOption = input.nextInt();//takes in user choice for main menu
        input.nextLine();
            switch(mainMenuOption){//pass in user option of main menu to take action on
                case 1:{//case 1 user chose to intake pet
                    menu.intakeMenu();//show menu to chose which animal to intake
                    int intakeOption = input.nextInt();//gather users choice on which animal to intake
                    input.nextLine();
                    switch(intakeOption){
                        case 1:{//user chose to add a cat
                            System.out.println("What do you want to name your cat?");
                            String catName = input.nextLine();//save user input for catName
                            Pet cat = new Cat(catName, "cat", mainMenuOption, intakeOption);//create new cat object
                            
                        }
                    }
                    break;
                }
                case 2:{

                    break;
                }
                case 3:{

                    break;
                }
                case 4:{
                    System.exit(0);
                    break;
                }
            }



}while(gameLoop);
    }
}