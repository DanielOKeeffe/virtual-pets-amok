package shelterAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DogTest {
	
	Dog anyDog = new Dog("name", 10, 10, 10, 10, 10, 10, "description");
	
	@Test
	public void shouldReturnAllDogProperties() {
		String name = anyDog.getName();
		int hunger = anyDog.getHunger();
		int thirst = anyDog.getThirst();
		int boredom = anyDog.getBoredom();
		int waste = anyDog.getWaste();
		int health = anyDog.getHealth();
		int happiness = anyDog.getHappiness();
		String description = anyDog.getDescription();
		assertEquals("name", name);
		assertEquals(10, hunger);
		assertEquals(10, thirst);
		assertEquals(10, boredom);
		assertEquals(10, waste);
		assertEquals(10, health);
		assertEquals(10, happiness);
		assertEquals("description", description);
	}
	
	@Test
	public void shouldHaveHungerDecreaseBy5AferFeed() {
		anyDog.feed();
		int hunger = anyDog.getHunger();
		assertEquals(5, hunger);
	}
	
	@Test
	public void shouldHaveThirstDecreaseBy5AfterWater() {
		anyDog.water();
		int thirst = anyDog.getThirst();
		assertEquals(5, thirst);
	}
	
	@Test
	public void playShouldIncreaseHungerAndThirstBy5AndDecreaseBoredomBy5() {
		anyDog.play();
		int hunger = anyDog.getHunger();
		int thirst = anyDog.getThirst();
		int boredom = anyDog.getBoredom();
		int happiness = anyDog.getHappiness();
		assertEquals(15, hunger);
		assertEquals(15, thirst);
		assertEquals(5, boredom);
		assertEquals(15, happiness);
	}
	
	@Test
	public void shouldHaveNoWasteAfterCleaning() {
		anyDog.clean();
		int waste = anyDog.getWaste();
		assertEquals(0, waste);
	}
	
	@Test
	public void shouldHaveWalkDecreaseWasteBy5AndIncreaseHappinessBy5() {
		anyDog.walk();
		int waste = anyDog.getWaste();
		int happiness = anyDog.getHappiness();
		assertEquals(5, waste);
		assertEquals(15, happiness);
	}
	
	@Test
	public void shouldHaveHealthDecreaseBy5() {
		anyDog.reduceHealth();
		int health = anyDog.getHealth();
		assertEquals(5, health);
	}
	

}
