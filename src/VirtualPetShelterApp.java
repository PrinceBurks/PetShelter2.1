import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        MenuOptions menu = new MenuOptions();
        Scanner input = new Scanner(System.in);
        VirtualPetShelter shelter = new VirtualPetShelter();

        RoboCat roboCat = new RoboCat("Demo RoboCat", 10, 10);
        RoboDog roboDog = new RoboDog("Demo RoboDog", 10, 10);
        Cat Cat = new Cat("Demo Cat", 10, 10);
        Dog Dog = new Dog("Demo Dog", 10, 10);
        shelter.addPet(roboCat);
        shelter.addPet(roboDog);
        shelter.addPet(Cat);
        shelter.addPet(Dog);

        int choice = 1;
        while (choice != 0) {
            menu.mainMenu();
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    menu.intakeMenu();
                    System.out.print("Enter choice: ");
                    choice = Integer.parseInt(input.nextLine());
                    switch (choice) {
                        case 1: {
                            System.out.print("What would you like to name your cat? ");
                            String name = input.nextLine();
                            System.out.print("Enter boredom points of cat: ");
                            int boredom = Integer.parseInt(input.nextLine());
                            System.out.print("Enter health points of cat: ");
                            int health = Integer.parseInt(input.nextLine());
                            shelter.addPet(new Cat(name, boredom, health));
                        }
                            break;
                        case 2: {
                            System.out.print("What would you like to name your dog? ");
                            String name = input.nextLine();
                            System.out.print("Enter boredom points of dog: ");
                            int boredom = Integer.parseInt(input.nextLine());
                            System.out.print("Enter health points of dog: ");
                            int health = Integer.parseInt(input.nextLine());
                            shelter.addPet(new Dog(name, boredom, health));
                        }
                            break;
                        case 3: {
                            System.out.print("What would you like to name your Robotic cat? ");
                            String name = input.nextLine();
                            System.out.print("Enter boredom points of Robotic cat: ");
                            int boredom = Integer.parseInt(input.nextLine());
                            System.out.print("Enter health points of Robotic cat: ");
                            int health = Integer.parseInt(input.nextLine());
                            shelter.addPet(new RoboCat(name, boredom, health));
                        }

                            break;
                        case 4: {
                            System.out.print("What would you like to name your Robotic dog? ");
                            String name = input.nextLine();
                            System.out.print("Enter boredom points of Robotic dog: ");
                            int boredom = Integer.parseInt(input.nextLine());
                            System.out.print("Enter health points of Robotic dog: ");
                            int health = Integer.parseInt(input.nextLine());
                            shelter.addPet(new RoboDog(name, boredom, health));
                        }
                            break;
                        default:
                            System.out.println("Please enter a valid option.");
                            break;
                    }
                    break;
                case 2: {
                    shelter.printAllPets();
                    System.out.println("Which pet would you like to adopt out? ");
                    System.out.print("Enter name of pet:");
                    String name = input.nextLine();
                    if (shelter.removePetWithName(name)) {
                        System.out.println("You have adopted out " + name + "!");
                    } else {
                        System.out.println("Sorry, we don't have a pet with that name.");
                    }
                }
                    break;
                case 3:
                    shelter.printAllPets();
                    break;
                case 4:
                    shelter.printAllOrganicPets();
                    break;
                case 5:
                    shelter.printAllRoboPets();
                    break;
                case 6:
                    shelter.feedAllPets();
                    System.out.println("You have fed all the pets!");
                    break;
                case 7:
                    shelter.waterAllOrangicPets();
                    System.out.println("You have watered all Organic pets!");
                    break;
                case 8:
                    System.out.println("Enter name of pet to play with: ");
                    String name = input.nextLine();
                    Pet pet = shelter.getOnePet(name);
                    if (pet.name.equals("null")) {
                        System.out.println("Sorry, we don't have a pet with that name.");
                        break;
                    }
                    shelter.playWithOnePet(Dog);
                    System.out.println("You have played with all the pets!");
                    break;
                case 9:
                    shelter.cleanDogKennels();
                    System.out.println("You have cleaned all the dog cages!");
                    break;
                case 10:
                    shelter.cleanLitterBox();
                    System.out.println("You have cleaned the litter box!");
                    break;
                case 11:
                    shelter.oilAllRoboPets();
                    System.out.println("You have oiled all the RoboPets!");
                    break;
                case 12:
                    shelter.walkAllDogs();
                    System.out.println("You have walked all the dogs!");
                    break;
                case 0:
                    System.out.println("Thank you for visiting the Virtual Pet Shelter!");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a valid option.");
                    break;
            }
        }
    }
}