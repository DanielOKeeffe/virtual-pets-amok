package shelterAmok;

public class Cat extends OrganicPet {

	public Cat(String name, int hunger, int thirst, int boredom, int waste, int health, int happiness, String description) {
		this.name = name;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.waste = waste;
		this.health = health;
		this.happiness = happiness;
		this.description = description;
	}
	
	public Cat(String name, String description) {
		this.name = name;
		this.hunger = 0;
		this.thirst = 0;
		this.boredom = 0;
		this.waste = 0;
		this.health = 50;
		this.health = 50;
		this.happiness = 50;
		this.description = description;
	}

}
