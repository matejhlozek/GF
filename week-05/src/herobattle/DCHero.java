package herobattle;

public class DCHero extends Hero {

    public DCHero(String name) {
        super(name, 45);

    }

    @Override
    public void punch(Hero hero) {
        if (hero instanceof DCHero) {
            System.out.println("I won't punch my teammate lol.");
        } else
            super.punch(hero);
    }

}
