package inventory.consumable;

import inventory.Item;

public class consumable extends Item {

    private int quantity;

    public consumable(String name, String description, String itemType, int quantity) {
        super(name, description, "Consumable");
        this.quantity = quantity;
    }

    //--SETTERS--
    public void setQuantity(int quantity) { this.quantity = quantity; }

    //--GETTERS--
    public int getQuantity() { return quantity; }


    public void addQuantity(int quantityGot){ quantity = quantity + quantityGot; }
}
