package shelterAmok;

public abstract class RoboticPet extends Pet {

	protected int oilLevel;

	public int getOilLevel() {
		return oilLevel;
	}

	public void reduceOilLevel() {
		oilLevel -= 5;
	}

	public void increaseOil() {
		oilLevel += 5;
	}

	@Override
	public void play() {
		boredom -= 5;
		this.reduceOilLevel();
	}

}