package virtual_pet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    @Test
    public void testFeed() {
        VirtualPet testPet = new VirtualPet(null, 10, 10, 10);
        // int hungerLevel = testPet.getHungerLevel();
        // hungerLevel = 4;
        int hungerLevel = (testPet.Feed() + 4);
        // testPet.setHungerLevel(10);
        assertEquals(20, hungerLevel);
    }

    @Test
    public void testGiveWater() {
        VirtualPet superPet = new VirtualPet(null, 0, 0, 0);

        assertEquals(10, superPet.GiveWater());

    }

    @Test
    public void testPlayFetch() {
        VirtualPet superPet = new VirtualPet(null, 0, 0, 0);

        assertEquals(10, superPet.PlayFetch());

    }

    @Test
    public void testTick() {
        // this.setHungerLevel(this.getHungerLevel() - 5);
        // this.setThirstLevel(this.getThirstLevel() - 4);
        // this.setBoredomLevel(this.getBoredomLevel() - 6);
        // VirtualPet superPet = new VirtualPet(null, 0, 0, 0);

        // assertEquals(-5, superPet.tick());
    }
}
