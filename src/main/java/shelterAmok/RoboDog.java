package shelterAmok;

public class RoboDog extends RoboticPet implements WalkDogs {

	public RoboDog(String name, int boredom, int health, int happiness, int oilLevel, String description) {
		this.name = name;
		this.boredom = boredom;
		this.health = health;
		this.happiness = happiness;
		this.oilLevel = oilLevel;
		this.description = description;
	}

	@Override
	public void walk() {
		happiness += 5;
	}

}
