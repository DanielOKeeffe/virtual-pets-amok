package shelterAmok;

public class Dog extends OrganicPet implements WalkDogs {

	public Dog(String name, int hunger, int thirst, int boredom, int waste, int health, int happiness, String description) {
		this.name = name;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.waste = waste;
		this.health = health;
		this.happiness = happiness;
		this.description = description;
	}

	@Override
	public void walk() {
		waste -= 5;
		happiness += 5;
	}

}
