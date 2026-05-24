package inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    // --ATRIBUTOS--
    private List<Item> items;
    private int maxSlots;

    // --CONSTRUTOR--
    public Inventory(int maxSlots) {
        this.maxSlots = maxSlots;
        this.items    = new ArrayList<>();
    }

    // --ADICIONAR/REMOVER--
    public void addItem(Item item) {
        if (isFull()) {
            System.out.println("Inventário cheio!");
            return;
        }
        items.add(item);
    }

    public void removeItem(int index) {
        if (index < 0 || index >= items.size()) {
            System.out.println("Item não encontrado!");
            return;
        }
        items.remove(index);
    }

    // --GETTERS--
    public Item getItem(int index)  { return items.get(index); }
    public int getMaxSlots()        { return maxSlots; }
    public int getCurrentSize()     { return items.size(); }
    public boolean isFull()         { return items.size() >= maxSlots; }

    // --PRINTS--
    public void printInventory() {
        System.out.println("Inventário (" + items.size() + "/" + maxSlots + "):");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("[" + i + "] " + items.get(i));
        }
    }
}