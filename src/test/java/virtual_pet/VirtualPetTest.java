package virtual_pet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    @Test
    public void testFeed() {
        VirtualPet superPet = new VirtualPet(null, 0, 0, 0);

        assertEquals(15, superPet.Feed());
    }

    @Test
    public void testGiveWater() {
        VirtualPet superPet = new VirtualPet(null, 0, 0, 0);

        assertEquals(15, superPet.giveWater());
    }

    @Test
    public void testPlayFetch() {
        VirtualPet superPet = new VirtualPet(null, 0, 0, 0);

        assertEquals(15, superPet.playFetch());
    }

    @Test
    public void testTick() {
        VirtualPet superPet = new VirtualPet(null, 0, 0, 0);
        superPet.tick();

        assertEquals(-5, superPet.getHungerLevel());
        assertEquals(-4, superPet.getThirstLevel());
        assertEquals(-6, superPet.getBoredomLevel());
    }
}
