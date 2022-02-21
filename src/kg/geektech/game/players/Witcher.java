package kg.geektech.game.players;

public class Witcher extends Hero {

    public Witcher(int health, int damage) {
        super(health, damage, SuperAbility.RESURRECTION);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() == 0 && this.getHealth() > 0) {
                heroes[i].setHealth(this.getHealth());
                this.setHealth(0);
            }

        }
    }
}
