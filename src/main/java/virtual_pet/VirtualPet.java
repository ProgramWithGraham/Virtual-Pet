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
        this.hungerLevel = 0;
        this.thirstLevel = 0;
        this.boredomLevel = 0;
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

    public int Feed() {
        int feed = hungerLevel - 10;
        return feed;
    }

    public int GiveWater() {
        int giveWater = thirstLevel - 10;
        return giveWater;
    }

    public int PlayFetch() {
        int playFetch = boredomLevel - 10;
        return playFetch;
    }

    @Override
    public String toString() {
        String petDetails = petName + " - stats are:  " + "Hunger: " + hungerLevel + "  Thirst: " + thirstLevel
                + "  Boredom: "
                + boredomLevel;
        return petDetails;
    }

    public void tick() {
        this.setHungerLevel(this.getHungerLevel() + 10);
        this.setThirstLevel(this.getThirstLevel() + 5);
        this.setBoredomLevel(this.getBoredomLevel() + 8);
        // increase this calling objects thirst, hunger, boredom
    }
}
