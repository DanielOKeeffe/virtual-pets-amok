package shelterAmok;

public abstract class Pet {

	protected String name;
	protected int boredom;
	protected int health;
	protected int happiness;
	protected String description;

	public String getName() {
		return name;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}

	public String getDescription() {
		return description;
	}
	
	public abstract void play();

	public void reduceHealth() {
		health -= 5;
	}

}