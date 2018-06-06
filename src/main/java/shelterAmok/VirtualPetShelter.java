package shelterAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, Pet> pets = new HashMap<>();

	public void add(Pet anyPet) {
		pets.put(anyPet.getName(), anyPet);
	}

	public Pet findPet(String name) {
		return pets.get(name);
	}

	public Collection<Pet> getAllPets() {
		return pets.values();
	}

	public void removePet(String name) {
		pets.remove(name);
	}

	public void feedPets() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feed();
			}
		}
	}

	public void waterPets() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).water();
			}
		}
	}

	public void oilAllRobots() {
		for (Pet pet : pets.values()) {
			if (pet instanceof RoboticPet) {
				((RoboticPet) pet).increaseOil();
			}
		}
	}

	public void emptyLitterBox() {
		for (Pet pet : pets.values()) {
			if (pet instanceof Cat) {
				((Cat) pet).clean();
			}
		}
	}

	public void cleanAllCages() {
		for (Pet pet : pets.values()) {
			if (pet instanceof Dog) {
				((Dog) pet).clean();
			}
		}
	}

	public void walkDogs() {
		for (Pet pet : pets.values()) {
			if (pet instanceof WalkDogs) {
				((WalkDogs) pet).walk();
			}
		}
	}

	public void organicTick() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).organicTick();
			}
		}
	}

	public void roboticTick() {
		for (Pet pet : pets.values()) {
			if (pet instanceof RoboticPet) {
				((RoboticPet) pet).roboticTick();
			}
		}
	}

	public void checkOrganicHealth() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				if (((OrganicPet) pet).getWaste() > 25) {
					pet.reduceHealth();
				} else if (((OrganicPet) pet).getHunger() <= 0) {
					pet.reduceHealth();
				} else if (((OrganicPet) pet).getThirst() <= 0) {
					pet.reduceHealth();
				}
			}
		}
	}

	public void checkRoboticHealth() {
		for (Pet pet : pets.values()) {
			if (pet instanceof RoboticPet) {
				if (((RoboticPet) pet).getOilLevel() <= 0) {
					pet.reduceHealth();
				}
			}
		}
	}

	public void displayAllOrganicPets() {
		System.out.println("Name" + "\t\t" + "Hunger" + "\t" + "Thirst" + "\t" + "Boredom" + "\t" + "Waste" + "\t" + "Health" + "\t" + "Happiness");
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				System.out.println(pet.getName() + "\t\t" + ((OrganicPet)pet).getHunger() + "\t" + ((OrganicPet)pet).getThirst() + "\t" + pet.getBoredom() + 
						"\t" + ((OrganicPet)pet).getWaste() + "\t" + pet.getHealth() + "\t" + pet.getHappiness());
			}
		}
		
	}
	
	public void displayAllRoboticPets() {
		System.out.println("Name" + "\t\t" + "Boredom" + "\t" + "Health" + "\t" + "Oil"+ "\t" +  "Happiness" );
		for (Pet pet : pets.values()) {
			if (pet instanceof RoboticPet) {
				System.out.println(pet.getName() + "\t\t" + + pet.getBoredom() + "\t" + pet.getHealth() + "\t" + ((RoboticPet)pet).getOilLevel() + "\t" + pet.getHappiness() );
			}
		}
		
	}

	public void displayAllPetDescriptions() {
		System.out.println("Name" + "\t\t" + "Description");
		for (Pet pet : pets.values()) {
			System.out.println(pet.getName() + "\t\t" + pet.getDescription());
		}
	}

	public boolean checkPetName(String enteredName) {
		for (Pet pet : pets.values()) {
			if (pet.getName().equals(enteredName)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkPetType(String enteredType) {
		if (enteredType.equals("Dog") || enteredType.equals("Cat") || enteredType.equals("RoboDog") || enteredType.equals("RoboCat")) {
			return true;
		}
		return false;
	}
}
