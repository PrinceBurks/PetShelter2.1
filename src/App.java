import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) {
        MenuOptions menu = new MenuOptions();
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Pet> petMap = PetMap.getInstance().referenceData;

        int choice = 1;
        int petKey = 1;
        
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                menu.tick();
            };
        };
        t.schedule(tt, new Date(), 1000);

        

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
                                Pet cat = new Cat(catName, "cat", 0, 100, 100, 100, 50, 50);// create new cat object
                                petMap.put(petKey, cat);// add pet to map using an incremented petkey
                                petKey++;// increment the pet key for the next pet added
                                menu.printAllpets();// print all pets
                                System.out.println("\nYou took " + catName + " into your Shelter");
                                break;

                            }
                            case 2: {// user chose dog
                                System.out.print("what would you like to name your dog?: ");
                                String dogName = input.nextLine();// save user input for DogName
                                Pet dog = new Dog(dogName, "dog", 0, 100, 100, 100, 50, 50);// create new pet object
                                petMap.put(petKey, dog);// add pet to map using an incremented petkey
                                petKey++;// increment the pet key for the next pet added
                                menu.printAllpets();// print all pets
                                System.out.println("\nYou took " + dogName + " into your Shelter");
                                break;
                            }
                            case 3: {// user chose roboCat
                                System.out.print("what would you like to name your RoboCat?: ");
                                String roboCatName = input.nextLine();// save user input for DogName
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
                                String roboDogName = input.nextLine();// save user input for DogName
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
                        choice = input.nextInt();
                        input.nextLine();
                    } while (choice == 1);
                    break;
                }
                case 2: {
                    int next = 1;
                    do {
                        menu.printAllpets();// print pets with their key values
                        System.out.print("\nWhich Pet would you like to adopt out to a family?: ");// ask user to chose
                                                                                                   // pet
                        int chosenPet = input.nextInt();// record users choice
                        input.nextLine();
                        String chosenPetName = petMap.get(chosenPet).getName();// save pet name so we can access after
                                                                               // it is deleted
                        petMap.remove(chosenPet);// remove users choice from MAP
                        System.out.println(chosenPetName + " was adopted by a loving family\n");
                        menu.yesorNo();// display yes or no menu and ask if they wanna adopt another
                        System.out.println("\n Would you like to adopt out another Pet?: ");
                        next = input.nextInt();// set users answer
                        input.nextLine();
                    } while (next == 1);// break out if they answer no (option 2)
                    break;
                }
                case 3: {// user chose to interact

                    menu.chooseWhatToInteractWithMenu();// ask user what they want to interact with
                    int userChoice = input.nextInt();// save response
                    input.nextLine();
                    switch (userChoice) {// start switch and pass in user response
                        case 1: {// user chose to interact with single pet
                            menu.printAllpets();// print list of all pets and their id to chose
                            System.out.print("Please choose a pet to interact with: ");
                            int petsKey = input.nextInt();// save user response
                            input.nextLine();
                            Pet singlePet = petMap.get(petsKey);// grab pet from the MAP based on user choice of pet id
                            int interact;// declare variable to break out of next loop
                            do {// start do while loop to stay in the interaction menu till user chooses to exit
                                menu.interactionsList();// display list of possible interactions
                                System.out.println("How would you like to interact with pet?: ");
                                interact = input.nextInt();// save users response
                                input.nextLine();
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

                            break;
                        }
                        case 3: {// user chose to interact with facility

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