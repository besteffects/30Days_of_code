package Interfaces;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Enemy implements Character {

    public String weapon = "lightsaber";

    public Enemy() {
    }

    public String getWeapon() {
        return weapon;
    }

    public void attack() {
        System.out.println("The enemy attacks you");
    }

    @Override
    public void heal() {
        System.out.println("The enemy heals himself");
    }

    public void weaponDraw() {

    }
}
