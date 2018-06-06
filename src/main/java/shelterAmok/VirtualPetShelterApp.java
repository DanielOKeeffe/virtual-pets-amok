package shelterAmok;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter myPetShelter = new VirtualPetShelter();

		Dog melvin = new Dog("Melvin", "Is wagging his tail");
		Cat diane = new Cat("Diane", "Sleeps where ever she feels like it");
		RoboDog tracy = new RoboDog("Tracy", "Doesn't know she is a robot");
		RoboCat felix = new RoboCat("Felix", "Plays in the bath tub");
		myPetShelter.add(melvin);
		myPetShelter.add(diane);
		myPetShelter.add(tracy);
		myPetShelter.add(felix);

		System.out.println("Welcome to the WCCI pet shelter!");
		System.out.println();

		String choice = "";

		do {
			System.out.println("Here are the pets in our shelter:");
			myPetShelter.displayAllOrganicPets();
			myPetShelter.organicTick();
			System.out.println();
			myPetShelter.displayAllRoboticPets();
			myPetShelter.roboticTick();

			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println();
			System.out.println("1. Feed the pets");
			System.out.println("2. Water the pets");
			System.out.println("3. Oil the pets");
			System.out.println("4. Clean the cat litter box");
			System.out.println("5. Clean the dog cages");
			System.out.println("6. Walk the dogs");
			System.out.println("7. Play with a pet");
			System.out.println("8. Adopt a pet");
			System.out.println("9. Admit a pet");
			System.out.println("10. Leave the shelter");

			choice = input.nextLine();

			if (choice.equals("1")) {
				myPetShelter.feedPets();
				System.out.println("The pets really love the food you gave them!");
				System.out.println();

			} else if (choice.equals("2")) {
				myPetShelter.waterPets();
				System.out.println("The pets must have been really thirsty!");
				System.out.println();

			} else if (choice.equals("3")) {
				myPetShelter.oilAllRobots();
				System.out.println("No more squeaky pets!");
				System.out.println();

			} else if (choice.equals("4")) {
				myPetShelter.emptyLitterBox();
				System.out.println("The cats are so much happier with a clean litter box!");
				System.out.println();

			} else if (choice.equals("5")) {
				myPetShelter.cleanAllCages();
				System.out.println("The dogs are wagging their tails now that their cages are clean!");
				System.out.println();

			} else if (choice.equals("6")) {
				myPetShelter.walkDogs();
				System.out.println("The dogs get so excited for a walk!");
				System.out.println();

			} else if (choice.equals("7")) {
				System.out.println("Which pet would you like to play with?");
				myPetShelter.displayAllPetDescriptions();
				String playChoice = input.nextLine();

				while (myPetShelter.checkPetName(playChoice) == false) {
					if (myPetShelter.checkPetName(playChoice) == false) {
						System.out.println("There is no pet by that name in the shelter.");
						System.out.println("Please enter a new name.");
						playChoice = input.nextLine();
					}
				}

				Pet playingPet = myPetShelter.findPet(playChoice);
				playingPet.play();
				System.out.println(playingPet.getName() + " is having so much fun!");
				System.out.println();

			} else if (choice.equals("8")) {
				if (myPetShelter.getAllPets().isEmpty()) {
					System.out.println("There are no pets to adopt right now! Come back soon!");
				} else {
					System.out.println("You have chosen to adopt a pet.");
					System.out.println("Which pet would you like to adopt?");
					myPetShelter.displayAllPetDescriptions();
					String adoptionChoice = input.nextLine();

					while (myPetShelter.checkPetName(adoptionChoice) == false) {
						if (myPetShelter.checkPetName(adoptionChoice) == false) {
							System.out.println("There is no pet by that name in the shelter.");
							System.out.println("Please enter a new name.");
							adoptionChoice = input.nextLine();
						}
					}

					myPetShelter.removePet(adoptionChoice);
					System.out.println("You have chosen to adopt " + adoptionChoice + ".");
					System.out.println("Thank you for adopting " + adoptionChoice + "!");
					System.out.println(adoptionChoice + " is so excited to go home with you!");
					System.out.println();
				}

			} else if (choice.equals("9")) {
				System.out.println("You have chosen admit a pet.");
				System.out.println("What is the name of the pet you are admitting?");
				String admitPetName = input.nextLine();
				System.out.println("What is a description of " + admitPetName + "?");
				String admitPetDescription = input.nextLine();
				System.out.println("What kind of pet is this? [Dog] [Cat] [RoboDog] [RoboCat]");
				String petType = input.nextLine();
				
				while(myPetShelter.checkPetType(petType) == false) {
					if(myPetShelter.checkPetType(petType) == false) {
						System.out.println("We do not accept pets of that type.");
						System.out.println("Please enter [Dog] [Cat] [RoboDog] [RoboCat]");
						petType = input.nextLine();
					}
				}

				if (petType.equals("Dog")) {
					Dog admitPet = new Dog(admitPetName, admitPetDescription);
					myPetShelter.add(admitPet);
				} else if (petType.equals("Cat")) {
					Cat admitPet = new Cat(admitPetName, admitPetDescription);
					myPetShelter.add(admitPet);
				} else if (petType.equals("RoboDog")) {
					RoboDog admitPet = new RoboDog(admitPetName, admitPetDescription);
					myPetShelter.add(admitPet);
				} else if (petType.equals("RoboCat")) {
					RoboCat admitPet = new RoboCat(admitPetName, admitPetDescription);
					myPetShelter.add(admitPet);
				}

				System.out.println("Thank you for admitting a pet! We will take great care of it!");
				System.out.println();

			} else if (choice.equals("10")) {
				System.out.println("Thank you for visiting the WCCI pet shelter! Please come again soon!");
				System.exit(0);
				
			} else {
				System.out.println("I do not understand your choice, please enter a new choice.");
				System.out.println();
			}

		} while (!choice.equals("10"));
		
		input.close();
		
	}

}
