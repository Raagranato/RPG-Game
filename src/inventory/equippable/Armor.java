package inventory.equippable;

public class Armor extends Equippable {

    // --ATRIBUTOS--
    private float defense; // 0.8 = protect 80% of the damage
    private String typeDef;

    // --CONSTRUTOR--
    public Armor(String name, String description, float defense, String typeDef) {
        super(name, "armor", description);
        this.defense = defense;
        this.typeDef = typeDef;
    }

    // --GETTERS--
    public float getDefense() { return defense; }
    public String getTypeDef() { return typeDef; }

    // --SETTERS--
    public void setDefense(float defense) { this.defense = defense; }
    public void setTypeDef(String typeDef) { this.typeDef = typeDef; }

    // --PRINTS--
    @Override
    public String toString() {
        return getName() + " | DEF: " + defense + " | Type: " + typeDef;
    }
}