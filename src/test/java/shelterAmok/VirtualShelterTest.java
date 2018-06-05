package shelterAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VirtualShelterTest {

	VirtualPetShelter underTest;
	Dog anyDog;
	Cat anyCat;
	RoboDog anyRoboDog;
	RoboCat anyRoboCat;

	@Before
	public void setUp() {
		underTest = new VirtualPetShelter();
		anyDog = new Dog("Melvin", 50, 50, 50, 50, 50, 50, "dog description");
		anyCat = new Cat("Diane", 50, 50, 50, 50, 50, 50, "cat description");
		anyRoboDog = new RoboDog("Patricia", 50, 50, 50, 50, "robodog description");
		anyRoboCat = new RoboCat("Felix", 50, 50, 50, 50, "robocat description");
		underTest.add(anyDog);
		underTest.add(anyCat);
		underTest.add(anyRoboDog);
		underTest.add(anyRoboCat);
	}

	@Test
	public void shouldBeAbleToAddPet() {
		underTest.add(anyDog);
		Pet foundPet = underTest.findPet(anyDog.getName());
		assertThat(foundPet, is(anyDog));
	}

	@Test
	public void shouldBeAbleToAddTwoPets() {
		Pet foundCat = underTest.findPet(anyCat.getName());
		Pet foundDog = underTest.findPet(anyDog.getName());
		assertThat(foundCat, is(anyCat));
		assertThat(foundDog, is(anyDog));
	}

	@Test
	public void shouldBeAbleToAddACollectionOfPets() {
		Collection<Pet> shelterPets = underTest.getAllPets();
		assertThat(shelterPets, containsInAnyOrder(anyRoboCat, anyRoboDog, anyDog, anyCat));
	}

	@Test
	public void shouldBeAbleToRemoveAPet() {
		underTest.removePet(anyRoboCat.getName());
		Collection<Pet> shelterPets = underTest.getAllPets();
		assertThat(shelterPets, containsInAnyOrder(anyRoboDog, anyDog, anyCat));
		assertThat(shelterPets.size(), is(3));
	}

	@Test
	public void shouldBeAbleToFeedAllOrganicPets() {
		underTest.feedPets();
		assertThat(anyCat.getHunger(), is(45));
		assertThat(anyDog.getHunger(), is(45));
	}

	@Test
	public void shouldBeAbleToWaterAllOrganicPets() {
		underTest.waterPets();
		assertThat(anyCat.getThirst(), is(45));
		assertThat(anyDog.getThirst(), is(45));
	}

	@Test
	public void shouldBeAbleToOilAllRoboPets() {
		underTest.oilAllRobots();
		assertThat(anyRoboCat.getOilLevel(), is(55));
		assertThat(anyRoboDog.getOilLevel(), is(55));
	}

	@Test
	public void shouldBeAbleToCleanAllCats() {
		underTest.emptyLitterBox();
		assertThat(anyCat.getWaste(), is(0));
	}

	@Test
	public void shouldBeAbleToCleanAllDogs() {
		underTest.cleanAllCages();
		assertThat(anyDog.getWaste(), is(0));
	}

	@Test
	public void shouldBeAbleToWalkAllDogs() {
		underTest.walkDogs();
		assertThat(anyDog.getHappiness(), is(55));
		assertThat(anyDog.getWaste(), is(45));
		assertThat(anyRoboDog.getHappiness(), is(55));
	}

	@Test
	public void shouldHaveDifferentValuesAfterOrganicTick() {
		underTest.organicTick();
		assertThat(anyDog.getHunger(), is(51));
		assertThat(anyCat.getWaste(), is(51));
	}

	@Test
	public void shouldHaveDifferentValuesAfterRoboticTick() {
		underTest.roboticTick();
		assertThat(anyRoboDog.getBoredom(), is(51));
		assertThat(anyRoboCat.getOilLevel(), is(49));
	}

	@Test
	public void shouldDecreaseOrganicHealthIfWasteIsGreaterThan25() {
		underTest.checkOrganicHealth();
		assertThat(anyDog.getHealth(), is(45));
		assertThat(anyCat.getHealth(), is(45));
	}

	@Test
	public void shouldDecreaseRoboticHealthIfOilLevelIsLessThan1() {
		RoboDog anyRoboDog2 = new RoboDog("Roberta", 50, 50, 50, 0, "robodog description");
		RoboCat anyRoboCat2 = new RoboCat("Shaq", 50, 50, 50, 0, "robocat description");
		underTest.add(anyRoboDog2);
		underTest.add(anyRoboCat2);
		underTest.checkRoboticHealth();
		assertThat(anyRoboDog2.getHealth(), is(45));
		assertThat(anyRoboCat2.getHealth(), is(45));
	}
	
	@Test
	public void shouldDecreaseHealthIfHungerIsLessThan1() {
		Dog anyDog2 = new Dog("Calvin", 0, 50, 50, 0, 50, 50, "dog description");
		Cat anyCat2 = new Cat("Harriet", 0, 50, 50, 0, 50, 50, "cat description");
		underTest.add(anyDog2);
		underTest.add(anyCat2);
		underTest.checkOrganicHealth();
		assertThat(anyDog2.getHealth(), is(45));
		assertThat(anyCat2.getHealth(), is(45));
	}
	
	@Test
	public void shouldDecreaseHealthIfThirstIsLessThan1() {
		Dog anyDog2 = new Dog("Calvin", 50, 0, 50, 0, 50, 50, "dog description");
		Cat anyCat2 = new Cat("Harriet", 50, 0, 50, 0, 50, 50, "cat description");
		underTest.add(anyDog2);
		underTest.add(anyCat2);
		underTest.checkOrganicHealth();
		assertThat(anyDog2.getHealth(), is(45));
		assertThat(anyCat2.getHealth(), is(45));
	}

}
