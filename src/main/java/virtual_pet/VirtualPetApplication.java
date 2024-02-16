package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner pet = new Scanner(System.in);
        System.out.println(
                " Welcome to the grand ole world of Virtual Pet. Your goal is to keep your pet satisfied with Food, Water and Play. The higher the number the better your pet is doing. ");
        System.out.println(" ");
        VirtualPet superPet = new VirtualPet("Krypto, the Super Dog", 55, 65, 75);

        System.out.println(superPet);
        superPet.printUserInstructions();
        while (true) {
            int userInput = pet.nextInt();

            if (userInput == 1) {
                System.out.println(""); // This is used to increase the Hunger level
                superPet.Feed();
                System.out.println("You have given your pet some food.");
                superPet.tick();

            } else if (userInput == 2) { // This is used to increase the Thirst level
                System.out.println("");
                superPet.giveWater();
                System.out.println("You have given your pet some water.");
                superPet.tick();

            } else if (userInput == 3) { // This is used to increase the boredom level
                System.out.println("");
                superPet.playFetch();
                System.out.println("You have played with your pet.");
                superPet.tick();

            }
            if (userInput == 4) { // Repeat current stats without causing a tick to trigger just incase user
                                  // forgot stats
                System.out.println("");

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
            System.out.println(superPet);
            superPet.printUserInstructions();
        }
        pet.close();

    }

}
