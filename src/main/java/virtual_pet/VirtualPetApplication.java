package virtual_pet;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPet superPet = new VirtualPet("Krypto, the Super Dog", 0, 0, 0);
        superPet.Tick();
        // int feedTheDog = dogNamedKrypto.Feed();
        // System.out.println(feedTheDog);
        superPet.Tick();
        superPet.Tick();

        System.out.println(superPet);
        System.out.println("Food: " + superPet.Feed() + " Thirst: " + superPet.GiveWater() + " Boredom: "
                + superPet.PlayFetch());

        while (true) {

            superPet.Tick();
        }
    }

}
