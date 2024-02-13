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
                System.out.println("");
                superPet.Feed();
                System.out.println("You have fed your pet.");
                superPet.Tick();
                System.out.println(superPet);
                superPet.printUserInstructions();
            } else if (userInput == 2) {
                System.out.println("");
                superPet.GiveWater();
                System.out.println("You have given your pet water.");
                superPet.Tick();
                System.out.println(superPet);
                superPet.printUserInstructions();
            } else if (userInput == 3) {
                System.out.println("");
                superPet.PlayFetch();
                System.out.println("You have played with your pet.");
                superPet.Tick();
                System.out.println(superPet);
                superPet.printUserInstructions();
            }
            if (userInput == 4) {
                System.out.println("");
                System.out.println(superPet);
                superPet.printUserInstructions();
            }

            if (userInput == 5) {
                System.out.println("");
                System.out.println(superPet.petName + " says: Baby Come Back, I just can't live without you!\n");
                System.out.println("");
                System.out.println("            /~~~~~~~~\\                           _");
                System.out.println("    ##\\__/ @)      ~~~~~~~~\\                     \\ \\ ) )");
                System.out.println("    |              /~~\\~~~~~                ((    |  \\");
                System.out.println("     \\    /           |                          /   |");
                System.out.println("      (~~~   /         \\____________/~~~~~~~~~~~~   /");
                System.out.println("       ~~~~|~                                     /");
                System.out.println("           :                                      |");
                System.out.println("            \\                                     |");
                System.out.println("            |                               /      \\");
                System.out.println("             \\  \\_         :         \\     /~~~\\    |");
                System.out.println("             /   :~~~~~|   :~~~~~~~~~~|   :     :   :");
                System.out.println("            /    :    /    :         /    :    /    :");
                System.out.println("        (~~~     )(~~~     )     (~~~     )(~~~     )");
                System.out.println("         ~~~~~~~~  ~~~~~~~~       ~~~~~~~~  ~~~~~~~~");
                System.out.println("          STOMP     STOMP          STOMP     STOMP");
                System.out.println("");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                break;
            }
        }
        pet.close();

    }

}
