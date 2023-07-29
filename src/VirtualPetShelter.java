import java.util.ArrayList;
import java.util.List;

public class VirtualPetShelter {
    List<Pet> pets;

    public VirtualPetShelter() {
        this.pets = new ArrayList<Pet>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    private void removePet(Pet pet) {
        pets.remove(pet);
    }

    public boolean removePetWithName(String name) {
        Pet delpet = new Pet("null", "null", 0, 0);
        for (Pet pet : pets) {
            if (pet.getName().equals(name)) {
                delpet = pet;
            }
        }
        if (delpet.getName().equals("null")) {
            return false;
        } else
            removePet(delpet);
        return true;
    }

    public void feedAllPets() {
        for (Pet pet : pets) {
            if (pet instanceof Cat || pet instanceof Dog) {
                ((Cat) pet).feedCat();
                ((Dog) pet).feedDog();
            }
        }
    }

    public void waterAllOrangicPets() {
        for (Pet pet : pets) {
            if (pet instanceof Cat || pet instanceof Dog) {
                ((Cat) pet).feedCat();
                ((Dog) pet).feedDog();
            }
        }
    }

    public Pet getOnePet(String name) {
        Pet getpet = new Pet("null", "null", 0, 0);
        for (Pet pet : pets) {
            if (pet.getName().equals(name)) {
                getpet = pet;
            }
        }
        return getpet;

    }

    public void playWithOnePet(Pet pet) {
        if (pet instanceof Cat) {
            ((Cat) pet).playWithCat();
        } else if (pet instanceof Dog) {
            ((Dog) pet).playFetch();
        }
    }

    public void cleanDogKennels() {
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                ((Dog) pet).cleanKennels();
            }
        }
    }

    public void cleanLitterBox() {
        for (Pet pet : pets) {
            if (pet instanceof Cat) {
                ((Cat) pet).cleanLitterBox();
            }
        }
    }

    public void walkAllDogs() {
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                ((Dog) pet).walkDog();
            }
        }
    }

    public void oilAllRoboPets() {
        for (Pet pet : pets) {
            if (pet instanceof RoboDog) {
                ((RoboDog) pet).oilRoboDog();
            }
            if (pet instanceof RoboCat) {
                ((RoboCat) pet).oilRoboCat();
            }
        }
    }

    public void chargeAllRoboDogs() {
        for (Pet pet : pets) {
            if (pet instanceof RoboDog) {
                ((RoboDog) pet).chargeRoboDog();
            }
        }
    }

    public void tickAllPets() {
        for (Pet pet : pets) {
            pet.tick();
        }
    }

    public void printAllPets() {
        System.out.println("Here are all the pets in the shelter: ");
        System.out.println("==================================================");
        for (Pet pet : pets) {
            System.out.println(pet);
        }
        System.out.println("==================================================");
    }

    public void printAllPetNames() {
        System.out.println("Here are all the pets in the shelter: ");
        for (Pet pet : pets) {
            System.out.println(pet.getName());
        }
        System.out.println("==================================================");
    }

    public void printAllOrganicCats() {
        System.out.println("Here are all the organic cats in the shelter: ");
        System.out.println("==================================================");
        for (Pet pet : pets) {
            if (pet instanceof Cat) {
                System.out.println(pet);
            }
        }
        System.out.println("==================================================");
    }

    public void printAllOrganicDogs() {
        System.out.println("Here are all the organic dogs in the shelter: ");
        System.out.println("==================================================");
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                System.out.println(pet);
            }
        }
        System.out.println("==================================================");
    }

    public void printAllRoboDogs() {
        System.out.println("Here are all the robo dogs in the shelter: ");
        System.out.println("==================================================");
        for (Pet pet : pets) {
            if (pet instanceof RoboDog) {
                System.out.println(pet);
            }
        }
        System.out.println("==================================================");
    }

    public void printAllRoboCats() {
        System.out.println("Here are all the robo cats in the shelter: ");
        System.out.println("==================================================");
        for (Pet pet : pets) {
            if (pet instanceof RoboCat) {
                System.out.println(pet);
            }
        }
        System.out.println("==================================================");
    }

    public void printAllOrganicPets() {
        System.out.println("Here are all the organic pets in the shelter: ");
        System.out.println("==================================================");
        for (Pet pet : pets) {
            if (pet instanceof Cat || pet instanceof Dog) {
                System.out.println(pet);
            }
        }
        System.out.println("==================================================");
    }

    public void printAllRoboPets() {
        System.out.println("Here are all the robo pets in the shelter: ");
        for (Pet pet : pets) {
            if (pet instanceof RoboCat || pet instanceof RoboDog) {
                System.out.println(pet);
            }
        }
        System.out.println("==================================================");
    }

}