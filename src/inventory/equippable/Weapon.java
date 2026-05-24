package inventory.equippable;

public class Weapon extends Equippable {

    // --ATRIBUTOS--
    private float dmgMult; // 1.5 = 150% de dano

    // --CONSTRUTOR--
    public Weapon(String name, String description, float dmgMult) {
        super(name, "weapon", description);
        this.dmgMult = dmgMult;
    }

    // --GETTERS--
    public float getDmgMult() { return dmgMult; }

    // --SETTERS--
    public void setDmgMult(float dmgMult) { this.dmgMult = dmgMult; }

    // --PRINTS--
    @Override
    public String toString() {
        return getName() + " | DMG: x" + dmgMult + " | " + getDescription();
    }
}