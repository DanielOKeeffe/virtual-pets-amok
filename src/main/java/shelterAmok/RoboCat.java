package shelterAmok;

public class RoboCat extends RoboticPet {

	public RoboCat(String name, int boredom, int health, int happiness, int oilLevel, String description) {
		this.name = name;
		this.boredom = boredom;
		this.health = health;
		this.happiness = happiness;
		this.oilLevel = oilLevel;
		this.description = description;
	}
	
	public RoboCat(String name, String description) {
		this.name = name;
		this.boredom = 0;
		this.health = 50;
		this.happiness = 50;
		this.oilLevel = 50;
		this.description = description;
	}

}
