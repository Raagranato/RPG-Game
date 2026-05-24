package inventory.equippable;

import inventory.Item;

public abstract class Equippable extends Item {

    // --ATRIBUTOS--
    private boolean equipped;

    // --CONSTRUTOR--
    public Equippable(String name, String itemType, String description) {
        super(name, itemType, description);
        this.equipped = false;
    }

    // --GETTERS--
    public boolean isEquipped() { return equipped; }

    // --SETTERS--
    public void setEquipped(boolean equipped) { this.equipped = equipped; }
}