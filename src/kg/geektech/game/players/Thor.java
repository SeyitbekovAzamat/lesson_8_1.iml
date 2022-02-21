package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero {
    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STAN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int stan = RPG_Game.random.nextInt(10) + 1;
        if (this.getHealth() > 0) {
            switch (stan) {
                case 5:
                    boss.setDamage(0);
                    System.out.println("стан");
                    break;
                case 1:
                    boss.setDamage(50);
                    break;
                case 2:
                    boss.setDamage(50);
                    break;
                case 3:
                    boss.setDamage(50);
                    break;
                case 4:
                    boss.setDamage(50);
                    break;
                case 6:
                    boss.setDamage(50);
                    break;
                case 7:
                    boss.setDamage(50);
                    break;
                case 8:
                    boss.setDamage(50);
                    break;
                case 9:
                    boss.setDamage(50);
                    break;
            }
        }
    }
}
