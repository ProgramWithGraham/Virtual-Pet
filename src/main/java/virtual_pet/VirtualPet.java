package virtual_pet;

/*
 * You will need to create a VirtualPet class.
Create at least four instance variables (Name, Hunger Level, Thirst Level, Boredom Level, or something else).
Create at least three methods (Think about the instance variables that will change over time!
 For example perhaps a feed() method that lowers hunger).
Create a tick() method that represents the passage of time. Call it once per loop.
 */
public class VirtualPet {
    String petName;
    int hungerLevel;
    int thirstLevel;
    int boredomLevel;

    public VirtualPet(String petName, int hungerLevel, int thirstLevel, int boredomLevel) {
        this.petName = petName;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
    }

    public void printUserInstructions() {
        System.out.println(" ");
        System.out.println("Please enter a number input from the following options: ");
        System.out.println(" 1. Feed your pet");
        System.out.println(" 2. Give your pet water");
        System.out.println(" 3. Play with your virtual pet");
        System.out.println(" 4. Get pet stats");
        System.out.println(" 5. End the program");
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public void setThirstLevel(int thirstLevel) {
        this.thirstLevel = thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public void setBoredomLevel(int boredomLevel) {
        this.boredomLevel = boredomLevel;
    }

    public void Feed() {
        hungerLevel += 10;
    }

    public void GiveWater() {
        thirstLevel += 10;
    }

    public void PlayFetch() {
        boredomLevel += 10;
    }

    @Override
    public String toString() {
        String petDetails = petName + " - stats are:  " + "Hunger: " + hungerLevel + "  Thirst: " + thirstLevel
                + "  Boredom: "
                + boredomLevel;
        return petDetails;
    }

    public void Tick() {
        this.setHungerLevel(this.getHungerLevel() - 6);
        this.setThirstLevel(this.getThirstLevel() - 5);
        this.setBoredomLevel(this.getBoredomLevel() - 8);
        // increase this calling objects thirst, hunger, boredom
    }

}
