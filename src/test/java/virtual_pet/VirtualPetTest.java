package virtual_pet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VirtualPetTest {
    private VirtualPet superPet;

    @BeforeEach
    public void setup() {
        VirtualPet superPet = new VirtualPet("Krypto, the Super Dog", 50, 50, 50);

    }

    @Test

    public void testFeed() {
        assertEquals(40, superPet.Feed());
    }

    @Test
    public void testGiveWater() {
        assertEquals(40, superPet.GiveWater());

    }

    @Test
    public void testPlayFetch() {
        assertEquals(40, superPet.PlayFetch());

    }

    @Test
    public void testTick() {

    }
}
