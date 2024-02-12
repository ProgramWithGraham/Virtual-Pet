package virtual_pet;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPet dogNamedKrypto = new VirtualPet("Krypto, the Super Dog", 0, 0, 0);
        dogNamedKrypto.tick();
        // int feedTheDog = dogNamedKrypto.Feed();
        // System.out.println(feedTheDog);
        dogNamedKrypto.tick();
        dogNamedKrypto.tick();

        System.out.println(dogNamedKrypto);
        System.out.println("Food: " + dogNamedKrypto.Feed() + " Thirst: " + dogNamedKrypto.GiveWater() + " Boredom: "
                + dogNamedKrypto.PlayFetch());

        while (true) {

            dogNamedKrypto.tick();
        }
    }

}
