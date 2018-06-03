package shelterAmok;

public abstract class OrganicPet extends Pet {

	protected int hunger;
	protected int thirst;
	protected int waste;

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getWaste() {
		return waste;
	}

	public void feed() {
		hunger -= 5;		
	}

	public void water() {
		thirst -= 5;
	}

	public void clean() {
		waste = 0;
	}
	
	@Override
	public void play() {
		hunger += 5;
		thirst += 5;
		boredom -= 5;
	}

}