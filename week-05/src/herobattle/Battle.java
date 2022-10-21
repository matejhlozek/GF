package herobattle;

import java.util.ArrayList;
import java.util.List;

public class Battle {


    private List<Hero> listOfHeroes = new ArrayList<>();

    public void setListOfHeroes(List<Hero> listOfHeroes) {
        this.listOfHeroes = listOfHeroes;
    }

    public static void main(String[] args) {
        List<Hero> listOfHeroes = new ArrayList<>();

        Battle battle = new Battle();
        battle.setListOfHeroes(listOfHeroes);


        MarvelHero ironMan = new MarvelHero("Iron Man");
        MarvelHero captainAmerica = new MarvelHero("Captain America");
        MarvelHero thor = new MarvelHero("Thor");
        MarvelHero hulk = new MarvelHero("Hulk");
        DCHero wonderWoman = new DCHero("Wonder Woman");
        DCHero flash = new DCHero("Flash");
        DCHero batman = new DCHero("Batman");

        listOfHeroes.add(ironMan);
        listOfHeroes.add(captainAmerica);
        listOfHeroes.add(thor);
        listOfHeroes.add(hulk);
        listOfHeroes.add(wonderWoman);
        listOfHeroes.add(flash);
        listOfHeroes.add(batman);

        System.out.println(batman);
        System.out.println(ironMan);
        ironMan.punch(batman);
        System.out.println(batman.getMotivation());
        ironMan.punch(batman);
        System.out.println(batman.getMotivation());
        ironMan.punch(batman);
        System.out.println(batman.getMotivation());
        System.out.println(batman);
        System.out.println(ironMan);
        battle.startBattle();


    }

    List<Hero> assembledAvengers;

    public List<Hero> avengersAssemble() {
        assembledAvengers = new ArrayList<>();
        for (Hero hero : listOfHeroes) {
            if (hero instanceof MarvelHero && hero.getMotivationLevel() == 2) {
                assembledAvengers.add(hero);
            }
        }
        return assembledAvengers;
    }


    public void startBattle() {

        avengersAssemble();

        for (Hero marvelHero : assembledAvengers) {
            for (Hero hero : listOfHeroes) {
                if (hero instanceof DCHero) {
                    marvelHero.punch(hero);
                    System.out.println(marvelHero.getName() + " punched " + hero.getName());
                    hero.punch(marvelHero);
                    System.out.println(hero.getName() + " punched " + marvelHero.getName());
                }
            }
        }

        int accumulatedMotivationDC = 0;
        int accumulatedMotivationMarvel = 0;
        for (Hero hero : listOfHeroes) {
            if (hero instanceof DCHero) {
                accumulatedMotivationDC += hero.getMotivation();
            }
        }
        for (Hero hero : assembledAvengers) {
            accumulatedMotivationMarvel += hero.getMotivation();
        }


        if (accumulatedMotivationDC > accumulatedMotivationMarvel) {
            for (Hero hero : listOfHeroes) {
                if (hero instanceof DCHero) {
                    System.out.println(hero);
                }
            }

        } else if (accumulatedMotivationDC == accumulatedMotivationMarvel) {
            for (Hero hero : listOfHeroes) {
                if (hero instanceof MarvelHero) {
                    System.out.println(hero);
                }
            }
        } else for (Hero hero : assembledAvengers) {
            System.out.println(hero.toString());
        }


    }
}
