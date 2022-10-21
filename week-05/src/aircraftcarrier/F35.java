package aircraftcarrier;

public class F35 extends Aircraft {


    public F35() {
        super(12, 50);
    }

    @Override
    public int refillAmmo(int ammoFromStation) {
        int unusedAmmo;
        setAmmo(maxAmmo);
        unusedAmmo = ammoFromStation - maxAmmo;
        return unusedAmmo;
    }

    @Override
    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    @Override
    public String getStatus() {
        return "Type F35" + ", Ammo: " + this.ammo + ", Base Damage: " + this.baseDamage + ", All damage: " + this.allDamage;
    }

    @Override
    public boolean isPriority() {
        return true;
    }

    @Override
    public String getType() {
        return "F35";
    }
}
