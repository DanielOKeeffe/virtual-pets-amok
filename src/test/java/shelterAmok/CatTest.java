package shelterAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatTest {

	Cat anyCat = new Cat("name", 10, 10, 10, 10, 10, 10, "description");

	@Test
	public void shouldReturnAllDCatProperties() {
		String name = anyCat.getName();
		int hunger = anyCat.getHunger();
		int thirst = anyCat.getThirst();
		int boredom = anyCat.getBoredom();
		int waste = anyCat.getWaste();
		int health = anyCat.getHealth();
		int happiness = anyCat.getHappiness();
		String description = anyCat.getDescription();
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
		anyCat.feed();
		int hunger = anyCat.getHunger();
		assertEquals(5, hunger);
	}
	
	@Test
	public void shouldHaveThirstDecreaseBy5AfterWater() {
		anyCat.water();
		int thirst = anyCat.getThirst();
		assertEquals(5, thirst);
	}
	
	@Test
	public void playShouldIncreaseHungerAndThirstBy5AndDecreaseBoredomBy5() {
		anyCat.play();
		int hunger = anyCat.getHunger();
		int thirst = anyCat.getThirst();
		int boredom = anyCat.getBoredom();
		int happiness = anyCat.getHappiness();
		assertEquals(15, hunger);
		assertEquals(15, thirst);
		assertEquals(5, boredom);
		assertEquals(15, happiness);
	}
	
	@Test
	public void shouldHaveNoWasteAfterCleaning() {
		anyCat.clean();
		int waste = anyCat.getWaste();
		assertEquals(0, waste);
	}
	
	@Test
	public void shouldHaveHealthDecreaseBy5() {
		anyCat.reduceHealth();
		int health = anyCat.getHealth();
		assertEquals(5, health);
	}

}
