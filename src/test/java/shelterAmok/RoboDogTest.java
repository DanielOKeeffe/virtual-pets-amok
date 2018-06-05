package shelterAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoboDogTest {
	
	RoboDog anyRoboDog = new RoboDog("name", 10, 10, 10, 10, "description");
	
	@Test
	public void shouldReturnAllDogProperties() {
		String name = anyRoboDog.getName();
		int boredom = anyRoboDog.getBoredom();
		int health = anyRoboDog.getHealth();
		int happiness = anyRoboDog.getHappiness();
		int oilLevel = anyRoboDog.getOilLevel();
		String description = anyRoboDog.getDescription();
		assertEquals("name", name);
		assertEquals(10, boredom);
		assertEquals(10, health);
		assertEquals(10, happiness);
		assertEquals(10, oilLevel);
		assertEquals("description", description);
	}
	
	@Test
	public void shouldDecreaseBoredomBy5AfterPlay() {
		anyRoboDog.play();
		int boredom = anyRoboDog.getBoredom();
		assertEquals(5, boredom);
	}
	
	@Test
	public void shouldHaveWalkIncreaseHappinessBy5() {
		anyRoboDog.walk();
		int happiness = anyRoboDog.getHappiness();
		assertEquals(15, happiness);
	}
	
	@Test
	public void shouldHaveHealthDecreaseBy5() {
		anyRoboDog.reduceHealth();
		int health = anyRoboDog.getHealth();
		assertEquals(5, health);
	}
	
	@Test
	public void shouldHaveOilLevelDecreaseBy5() {
		anyRoboDog.reduceOilLevel();
		int oilLevel = anyRoboDog.getOilLevel();
		assertEquals(5, oilLevel);
	}
	
	@Test
	public void shouldDecreaseOilLevelBy5AfterPlay() {
		anyRoboDog.play();
		int oilLevel = anyRoboDog.getOilLevel();
		int happiness = anyRoboDog.getHappiness();
		assertEquals(5, oilLevel);
		assertEquals(15, happiness);
	}
	
	@Test
	public void shouldIncreaseOilLevelAfterOilingBy5() {
		anyRoboDog.increaseOil();
		int oilLevel = anyRoboDog.getOilLevel();
		assertEquals(15, oilLevel);
	}
	
}
