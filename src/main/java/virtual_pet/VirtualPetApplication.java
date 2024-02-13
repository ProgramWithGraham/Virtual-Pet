package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner pet = new Scanner(System.in);
        System.out.println(" Welcome to the grand world of Virtual Pet. ");
        VirtualPet superPet = new VirtualPet("Krypto, the Super Dog", 50, 50, 100);

        System.out.println(superPet);
        superPet.printUserInstructions();
        while (true) {

            int userInput = pet.nextInt();
            if (userInput == 1) {
                superPet.Feed();
                System.out.println("You have fed your pet.");
                superPet.Tick();

                System.out.println(superPet);
                superPet.printUserInstructions();

            } else if (userInput == 2) {
                superPet.GiveWater();
                System.out.println("You have given your pet water.");
                superPet.Tick();

                System.out.println(superPet);
                superPet.printUserInstructions();
            } else if (userInput == 3) {
                superPet.PlayFetch();
                System.out.println("You have played with your pet.");
                superPet.Tick();

                System.out.println(superPet);
                superPet.printUserInstructions();
            }

            if (userInput == 4) {
                System.out.println(superPet);

                superPet.printUserInstructions();

            }

            if (userInput == 5) {
                break;
            }
            // int feedTheDog = dogNamedKrypto.Feed();
            // System.out.println(feedTheDog);
        }
        pet.close();

    }

}
