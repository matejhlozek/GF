package Pirates;

public class Pirate {
    public String name;
    public int intoxication;

    public Pirate(String name, int intoxication){
        this.name = name;
        this.intoxication = 0;
    }


    public String toString(){
        return name + ", intoxication: " + intoxication;
    }

    public void drinkSomeRum(){
        intoxication += 1;
    }

    public void howsItGoingMate(){
        if (intoxication <= 4){
            System.out.println("Pour me anudder!");
        } else System.out.println
                ("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                intoxication = 0;
    }
    public void die(){
        name += " ...he's dead";
    }
}


