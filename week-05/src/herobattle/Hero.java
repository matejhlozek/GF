package herobattle;

public abstract class Hero {

    private String name;

    public String getName() {
        return name;
    }

    private int motivation;
    private int damage;


    public Hero(String name, int motivation) {
        this.name = name;
        this.motivation = motivation;
        this.damage = 0;
    }

    public int getMotivationLevel() {
        int motivationLevel = 1;
        if (this.motivation <= 25) {
            motivationLevel = 0;
            return motivationLevel;
        } else if (this.motivation >= 40) {
            motivationLevel = 2;
            return motivationLevel;
        } else return motivationLevel;
    }

    public int getMotivation() {
        return this.motivation;
    }


    public void bePunched(double damage) {
        if (this.motivation >= (int) (damage / (this.motivation / 2d))) {
            this.motivation -= (int) (damage / (this.motivation / 2d));
        } else this.motivation = 0;

    }

    public void punch(Hero hero) {
        if (this.motivation > 0) {
            this.damage = (int) (hero.motivation / 1.5);
        }
        hero.bePunched(this.damage);
    }

    @Override
    public String toString() {
        if (getMotivationLevel() == 0) {
            return name + " is not motivated anymore.";
        } else if (getMotivationLevel() == 1) {
            return name + " is motivated.";
        } else return name + " is well motivated.";
    }

}
