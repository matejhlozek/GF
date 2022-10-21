package herobattle;

public class MarvelHero extends Hero {

    public MarvelHero(String name) {
        super(name, 40);

    }

    @Override
    public void punch(Hero hero) {
        if (!(hero instanceof MarvelHero)) {
            super.punch(hero);
        }
    }
}
