package Interfaces;

import java.util.Random;

public class StarWarsInterfacePractice {
    public static Character summonCharacter() {
        Random rand = new Random();
        if (Math.abs(rand.nextInt() % 2) == 0) {
            return new Enemy();
        } else {
            return new Hero();
        }
    }

    public static void main(String[] args) {
        Enemy darthVader = new Enemy();
        Hero Ob1WanKenobi = new Hero();
        darthVader.attack();
        Ob1WanKenobi.attack();
        darthVader.heal();
        Ob1WanKenobi.heal();
        System.out.println("Enemy weapon:" + darthVader.getWeapon());
        System.out.println("Hero weapon: " + Ob1WanKenobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }
}
