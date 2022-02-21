package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Hacker extends Hero {
    public Hacker(int health, int damage) {
        super(health, damage, SuperAbility.HACKER);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth() > 0) {
            if (RPG_Game.round_number % 2 == 0) {
            boss.setHealth(boss.getHealth() - 10);
                for (int i = 0; i < heroes.length; i++) {
                    heroes[i].setHealth(heroes[i].getHealth() + 10);
                    break;
                }
            }
        }
    }
}
