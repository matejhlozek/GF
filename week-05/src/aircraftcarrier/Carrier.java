package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {


    private int totalAmmo;
    private int health;

    public Carrier() {
        this.totalAmmo = 3000;
        this.health = 5000;
    }


    private List<Aircraft> carrier = new ArrayList<>();

    public void add(Aircraft aircraft) {
        carrier.add(aircraft);
    }

    public int sumOfAllAmmoNeeded() {
        int sum = 0;
        int needed = 0;
        for (Aircraft aircraft : carrier) {
            sum += aircraft.getAmmo();
            needed += aircraft.getMaxAmmo() - sum;
        }
        return needed;
    }

    public void fill() throws Exception {
        totalAmmo -= sumOfAllAmmoNeeded();
        for (Aircraft aircraft : carrier) {
            if (totalAmmo < sumOfAllAmmoNeeded()) {
                if (aircraft.isPriority()) {
                    aircraft.setAmmo(aircraft.getMaxAmmo());
                } else if (totalAmmo == 0) throw new Exception("Not enough ammo.");
            } else aircraft.setAmmo(aircraft.getMaxAmmo());
        }
    }


    public void fight(Carrier carrier) {
        for (Aircraft aircraft : this.carrier) {
            carrier.health -= aircraft.getAmmo() * aircraft.getBaseDamage();
            aircraft.setAmmo(0);
        }
    }

    public String getStatus() {
        int totalDamage = 0;
        for (Aircraft aircraft : carrier)
            totalDamage += aircraft.getAmmo() * aircraft.getBaseDamage();
        if (this.health > 0) {
            return "HP: " + this.health + ", Aircraft count: " + this.carrier.size()
                    + ", Ammo Storage: " + this.totalAmmo + ", Total damage: " + totalDamage
                    + "\n" + "Aircrafts:" + "\n" + carrier;
        } else return "It's dead Jim :(";
    }

    @Override
    public String toString() {
        return "totalAmmo=" + totalAmmo +
                ", health=" + health +
                ", carrier=" + carrier +
                "\n";
    }
}
