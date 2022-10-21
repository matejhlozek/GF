package aircraftcarrier;

abstract class Aircraft {
    protected int maxAmmo;
    protected int ammo;
    protected int baseDamage;
    protected int allDamage;


    public Aircraft(int maxAmmo, int baseDamage) {
        this.allDamage = maxAmmo * baseDamage;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
    }


    public int fight() {
        this.ammo = 0;
        return this.allDamage += this.baseDamage * this.maxAmmo;

    }

    public abstract int refillAmmo(int ammoFromStation);


    public boolean isPriority() {
        return false;
    }


    public String getStatus() {
        return "";
    }

    public String getType() {
        return "";
    }

    public int getAmmo() {
        return ammo;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    @Override
    public String toString() {
        return "Type " + getType() +
                ", ammo: " + ammo +
                ", Base Damage: " + baseDamage +
                ", All Damage: " + allDamage + "\n";
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getBaseDamage() {
        return baseDamage;
    }
}
