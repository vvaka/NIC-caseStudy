package nic;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HouseHuntTest {
	
	HouseHunt houseHunt = new HouseHunt();;

	
	@Test
	public void testFindHouse() {
		Integer[] houses = { 51,75,80 ,206, 100,106};
		assertThat("house hunt 206", houseHunt.findHouse(houses),is(206));
		Integer[] houses2 ={52,70,122, 72,50};
		assertThat("house hunt 122", houseHunt.findHouse(houses2),is(122));
		
	}

}
