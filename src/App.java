import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) {
        Keyboard input = new Keyboard();
        MenuOptions menu = new MenuOptions();// create menu object
        Facility facility = new Facility(0, 0, 100, 100, 0, 0, 0);// create facility object

        HashMap<Integer, Pet> petMap = PetMap.getInstance().referenceData;
        int choice = 1;
        int petKey = 1;
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                menu.tick();
                facility.tick();
            };
        };
        t.schedule(tt, new Date(), 10000);
        boolean gameLoop = true;
        // call start menu
        do {
            menu.mainMenu();// runs main menu to ask user what they want to do
            int mainMenuOption = input.keyboardInt();// takes in user choice for main menu

            switch (mainMenuOption) {// pass in user option of main menu to take action on
                case 1: {// case 1 user chose to intake pet
                    do {
                        menu.intakeMenu();// show menu to chose which animal to intake
                        int intakeOption = input.keyboardInt();// gather users choice on which animal to intake

                        switch (intakeOption) {
                            case 1: {// user chose to add a cat
                                System.out.print("What do you want to name your cat?: ");
                                String catName = input.keyboardStr();// save user input for catName
                                Pet cat = new Cat(catName, "cat", 0, 100, 100, 100, 50, 50);// create new cat object
                                petMap.put(petKey, cat);// add pet to map using an incremented petkey
                                petKey++;// increment the pet key for the next pet added
                                menu.printAllpets();// print all pets
                                System.out.println("\nYou took " + catName + " into your Shelter");
                                break;
                            }
                            case 2: {// user chose dog
                                System.out.print("what would you like to name your dog?: ");
                                String dogName = input.keyboardStr();// save user input for DogName
                                Pet dog = new Dog(dogName, "dog", 0, 100, 100, 100, 50, 50);// create new pet object
                                petMap.put(petKey, dog);// add pet to map using an incremented petkey
                                petKey++;// increment the pet key for the next pet added
                                menu.printAllpets();// print all pets
                                System.out.println("\nYou took " + dogName + " into your Shelter");
                                break;
                            }
                            case 3: {// user chose roboCat
                                System.out.print("what would you like to name your RoboCat?: ");
                                String roboCatName = input.keyboardStr();// save user input for DogName
                                Pet roboCat = new RoboCat(roboCatName, "robocat", 0, 100, 100, 100, 100, 100);// create
                                                                                                              // new pet
                                                                                                              // object
                                petMap.put(petKey, roboCat);// add pet to map using an incremented petkey
                                petKey++;// increment the pet key for the next pet added
                                menu.printAllpets();// print all pets
                                System.out.println("\nYou took " + roboCatName + " into your Shelter");
                                break;
                            }
                            case 4: {// user chose roboDog
                                System.out.print("what would you like to name your RoboDog?: ");
                                String roboDogName = input.keyboardStr();// save user input for DogName
                                Pet roboDog = new RoboDog(roboDogName, "robodog", 0, 100, 100, 100, 100, 100);// create
                                                                                                              // new pet
                                                                                                              // object
                                petMap.put(petKey, roboDog);// add pet to map using an incremented petkey
                                petKey++;// increment the pet key for the next pet added
                                menu.printAllpets();// print all pets
                                System.out.println("\nYou took " + roboDogName + " into your Shelter");
                                break;
                            }
                        }
                        menu.yesorNo();
                        System.out.print("Would you like to take in another pet?: ");
                        choice = input.keyboardInt();

                    } while (choice == 1);
                    break;
                }
                case 2: {
                    int next = 1;
                    do {
                        menu.printAllpets();// print pets with their key values
                        System.out.print("\nWhich Pet would you like to adopt out to a family?: ");// ask user to chose
                                                                                                   // pet
                        int chosenPet = input.keyboardInt();// record users choice

                        String chosenPetName = petMap.get(chosenPet).getName();// save pet name so we can access after
                                                                               // it is deleted
                        petMap.remove(chosenPet);// remove users choice from MAP
                        System.out.println(chosenPetName + " was adopted by a loving family\n");
                        menu.yesorNo();// display yes or no menu and ask if they wanna adopt another
                        System.out.println("\n Would you like to adopt out another Pet?: ");
                        next = input.keyboardInt();// set users answer

                    } while (next == 1);// break out if they answer no (option 2)
                    break;
                }
                case 3: {// user chose to interact
                    menu.chooseWhatToInteractWithMenu();// ask user what they want to interact with
                    int userChoice = input.keyboardInt();// save response

                    switch (userChoice) {// start switch and pass in user response
                        case 1: {// user chose to interact with single pet
                            menu.printAllpets();// print list of all pets and their id to chose
                            System.out.print("Please choose a pet to interact with: ");
                            int petsKey = input.keyboardInt();// save user response

                            Pet singlePet = petMap.get(petsKey);// grab pet from the MAP based on user choice of pet id
                            int interact;// declare variable to break out of next loop
                            do {// start do while loop to stay in the interaction menu till user chooses to exit
                                menu.interactionsList();// display list of possible interactions
                                System.out.println("How would you like to interact with pet?: ");
                                interact = input.keyboardInt();// save users response

                                switch (interact) {// start switch and pass in chosen interaction
                                    case 0: {// user chose to exit
                                        break;
                                    }
                                    case 1: {// user chose to feed
                                        singlePet.feed();// call method to feed
                                        menu.regularPetStats(petsKey);// display chosen pets stats
                                        break;
                                    }
                                    case 2: {// user chose to water pet
                                        singlePet.water();// call method to water pet
                                        menu.regularPetStats(petsKey);// display stats of chosen pet
                                        break;
                                    }
                                    case 3: {// user chose to pet
                                        singlePet.pet();// call method to pet animal
                                        menu.regularPetStats(petsKey);// display chosen pets stats
                                        break;
                                    }
                                    case 4: {// user chose to play fetch
                                        singlePet.fetch();// call method to play fetch
                                        menu.regularPetStats(petsKey);// display chosen pets stats
                                        break;
                                    }
                                    case 5: {// user chose to wash pet
                                        singlePet.wash();// call method to was the pet
                                        menu.regularPetStats(petsKey);// display chosen pets stats
                                        break;
                                    }
                                    case 6: {// user chose to polish the pet
                                        singlePet.polish();// call method to polish
                                        menu.regularPetStats(petsKey);// display chosen pets stats
                                        break;
                                    }
                                    case 7: {// user chose to walk the pet
                                        singlePet.walk();// call method to walk pet
                                        menu.regularPetStats(petsKey);// display chosen pets stats
                                        break;
                                    }
                                    case 8: {// user chose to let pet nap
                                        singlePet.nap();// call method to nap the pet
                                        menu.regularPetStats(petsKey);// display chosen pets stats
                                        break;
                                    }
                                    case 9: {// user chose to groom pet
                                        singlePet.groom();// call method to groom pet
                                        menu.regularPetStats(petsKey);// display chosen pets stats
                                        break;
                                    }
                                    case 10: {// user chose to oil pet
                                        singlePet.oil();// call method to oil pet
                                        menu.regularPetStats(petsKey);// display chosen pets stats
                                        break;
                                    }
                                }
                            } while (interact != 0);// break loop if user option is 0
                            break;
                        }
                        case 2: {// user chose to interact with all animals
                            menu.allPetsStats();//print all pets stats
                            do{//set do while loop
                            menu.interactionsList();//show list of interactions
                            System.out.print("How would you like to interact?");
                            choice = input.keyboardInt();//save user choice for interaction
                            switch (choice) {//pass user choice into switch
                                case 0: {// user chose to exit
                                    break;
                                }
                                case 1: {//user chose to feed all pets
                                    for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {//loop through all pets map
                                        mp.getValue().feed();//feed pet
                                    }
                                    menu.allPetsStats();//show stats
                                    break;
                                }
                                case 2: {// user chose to water all pet
                                    for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {//loop through all pets map
                                        mp.getValue().water();//water pets
                                        
                                    }
                                    menu.allPetsStats();//show stats
                                    break;
                                }
                                case 3: {// user chose to all pet
                                    for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {//loop through all pets map
                                        mp.getValue().pet();//pet all pets
                                    }
                                    menu.allPetsStats();//show stats
                                    break;
                                }
                                case 4: {// user chose to play all fetch
                                    for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {//loop through all pets map
                                        mp.getValue().fetch();//fetch with all pets
                                    }
                                    menu.allPetsStats();//show stats
                                    break;
                                }
                                case 5: {// user chose to wash all pet
                                    for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {//loop through all pets map
                                        mp.getValue().wash();//wash all pets
                                    }
                                    menu.allPetsStats();//show stats
                                    break;
                                }
                                case 6: {// user chose to polish all pet
                                    for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {//loop through all pets map
                                        mp.getValue().polish();//polish all pets
                                    }
                                    menu.allPetsStats();//show stats
                                    break;
                                }
                                case 7: {// user chose to walk all pet
                                    for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {//loop through all pets map
                                        mp.getValue().walk();//walk all pets
                                    }
                                    menu.allPetsStats();//show stats
                                    break;
                                }
                                case 8: {// user chose to let all nap
                                    for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {//loop through all pets map
                                        mp.getValue().nap();//let all pets take a nap
                                    }
                                    menu.allPetsStats();//show stats
                                    break;
                                }
                                case 9: {// user chose to groom all pet
                                    for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {//loop through all pets map
                                        mp.getValue().groom();//groom all pets
                                    }
                                    menu.allPetsStats();//show stats
                                    break;
                                }
                                case 10: {// user chose to oil all pet
                                    for (Map.Entry<Integer, Pet> mp : petMap.entrySet()) {//loop through all pets map
                                        mp.getValue().oil();//oil all pets
                                    }
                                    menu.allPetsStats();//show stats
                                    break;
                                }
                            }
                            }while(choice != 0);// loop till user choses exit option 0
                            break;
                        }
                        case 3: {// user chose to interact with facility
                            int interactOption = 1;// initialize the loop variable
                            menu.facilityStats(facility);// show facility stats
                            do {// start do while loop
                                menu.facilityMenu();// show facility interaction menu
                                System.out.print("How would you like to interact?: ");
                                interactOption = input.keyboardInt();// have user chose interaction
                                switch (interactOption) {// pass in user choice to switch
                                    case 0: {// user chose to go back
                                        break;
                                    }
                                    case 1: {// user chose to empty litter
                                        facility.emptyLitter();// method call to empty litter
                                        menu.facilityStats(facility);// method call to show stats
                                        break;
                                    }
                                    case 2: {// use chose to clean dog kennels
                                        facility.cleanKennels();// call to clean kennels
                                        menu.facilityStats(facility);// show stats
                                        break;
                                    }
                                    case 3: {// user chose to take trash out
                                        facility.takeTrash();// call to take trash out
                                        menu.facilityStats(facility);// show stats
                                        break;
                                    }
                                    case 4: {// user chose to clean up toys
                                        facility.cleanToys();// call to clean toys
                                        menu.facilityStats(facility);// show stats
                                        break;
                                    }
                                    case 5: {// user chose to cut grass
                                        facility.cutGrass();// call to cut grass
                                        menu.facilityStats(facility);// show stats
                                        break;
                                    }
                                }
                            } while (interactOption != 0);// break out of loop when user choses option 0 (go back)
                            break;
                        }
                    }
                    break;
                }
                case 4: {// user chose to exit program
                    System.exit(0);
                    break;
                }
            }

        } while (gameLoop);// infinite game loop variable
    }

    public void run() {
        System.out.println("timer working");
    }
}