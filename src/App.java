import java.util.HashMap;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        MenuOptions menu = new MenuOptions();
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Pet> petMap = PetMap.getInstance().referenceData;
        
        int choice = 1;
        int petKey = 1;

        boolean gameLoop = true;
        // call start menu
        do {
            menu.mainMenu();// runs main menu to ask user what they want to do
            int mainMenuOption = input.nextInt();// takes in user choice for main menu
            input.nextLine();

            switch (mainMenuOption) {// pass in user option of main menu to take action on

                case 1: {// case 1 user chose to intake pet
                    do {
                        menu.intakeMenu();// show menu to chose which animal to intake
                        int intakeOption = input.nextInt();// gather users choice on which animal to intake
                        input.nextLine();
                        switch (intakeOption) {
                            case 1: {// user chose to add a cat
                                System.out.print("What do you want to name your cat?: ");
                                String catName = input.nextLine();// save user input for catName
                                Pet cat = new Cat(catName, "cat", 0, 100, 100, 100, 0, 0);// create new cat object
                                petMap.put(petKey, cat);// add pet to map using an incremented petkey
                                petKey++;// increment the pet key for the next pet added
                                menu.printAllpets();//print all pets                             
                                System.out.println("\nYou took " + catName + " into your Shelter");
                                break;

                            }
                            case 2: {// user chose dog
                                System.out.print("what would you like to name your dog?: ");
                                String dogName = input.nextLine();// save user input for DogName
                                Pet dog = new Dog(dogName, "dog", 0, 100, 100, 100, 0, 0);// create new pet object
                                petMap.put(petKey, dog);// add pet to map using an incremented petkey
                                petKey++;// increment the pet key for the next pet added
                                menu.printAllpets();//print all pets
                                System.out.println("\nYou took " + dogName + " into your Shelter");
                                break;
                            }
                            case 3: {// user chose roboCat
                                System.out.print("what would you like to name your RoboCat?: ");
                                String roboCatName = input.nextLine();// save user input for DogName
                                Pet roboCat = new RoboCat(roboCatName, "robocat", 0, 100, 100, 100, 100, 100);// create new pet object
                                petMap.put(petKey, roboCat);// add pet to map using an incremented petkey
                                petKey++;// increment the pet key for the next pet added
                                menu.printAllpets();//print all pets
                                System.out.println("\nYou took " + roboCatName + " into your Shelter");
                                break;
                            }
                            case 4: {// user chose roboDog
                                System.out.print("what would you like to name your RoboDog?: ");
                                String roboDogName = input.nextLine();// save user input for DogName
                                Pet roboDog = new RoboDog(roboDogName, "robodog", 0, 100, 100, 100, 100, 100);// create new pet object                                
                                petMap.put(petKey, roboDog);// add pet to map using an incremented petkey
                                petKey++;// increment the pet key for the next pet added
                                menu.printAllpets();//print all pets
                                System.out.println("\nYou took " + roboDogName + " into your Shelter");
                                break;
                            }
                        }
                        menu.yesorNo();
                        System.out.print("Would you like to take in another pet?: ");
                        choice = input.nextInt();
                        input.nextLine();
                    } while (choice == 1);
                    break;
                }
                case 2: {
                    int next = 1;
                    do{
                    menu.printAllpets();//print pets with their key values
                    System.out.print("\nWhich Pet would you like to adopt out to a family?: ");//ask user to chose pet
                    int chosenPet = input.nextInt();//record users choice
                    input.nextLine();
                    String chosenPetName = petMap.get(chosenPet).getName();//save pet name so we can access after it is deleted
                    petMap.remove(chosenPet);//remove users choice from MAP
                    System.out.println(chosenPetName + " was adopted by a loving family\n");
                    menu.yesorNo();
                    System.out.println("\n Would you like to adopt out another Pet?: ");
                    next = input.nextInt();
                    input.nextLine();
                    }while(next == 1);
                    break;
                }
                case 3: {
                    menu.printAllpets();
                    menu.chooseWhatToInteractWithMenu();
                    break;
                }
                case 4: {
                    System.exit(0);
                    break;
                }
            }

        } while (gameLoop);
    }
}