package Interfaces;

public class Hero implements Character {
    public String weapon = "The Force";

    public String getWeapon() {
        return weapon;
    }

    public void attack() {
        System.out.println("The hero attack the enemy");
    }

    public void heal() {
        System.out.println("The hero heals you");
    }
}
