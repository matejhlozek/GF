package aircraftcarrier;

public class F16 extends Aircraft {


    public F16() {
        super(8, 30);
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
        return "Type F16" + ", Ammo: " + this.ammo + ", Base Damage: " + this.baseDamage + ", All damage: " + this.allDamage;
    }

    @Override
    public String getType() {
        return "F16";
    }
}
