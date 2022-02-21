package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

import java.util.Random;

public class Magic extends Hero {
    int increased_damage_to_heroes = 10;

    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        if (this.getHealth() > 0 && boss.getHealth() > 0) {
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i] instanceof Witcher){

                }else {
                    heroes[i].setDamage(heroes[i].getDamage() + increased_damage_to_heroes);
                }
            }
        }
    }
}

