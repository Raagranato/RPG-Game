package inventory;//Pelo q ta aq da pra ter um inventario com um numeor limitado de slots mas c um numeor infinito de itens em cada slot

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    // --ATRIBUTOS--
    private List<Item> items;
    private int maxSlots;

    // --CONSTRUTOR--
    public Inventory(int maxSlots) {
        this.maxSlots = maxSlots;
        this.items = new ArrayList<>();
    }

    //--SETTERS--
    public void setMaxSlots(int maxSlots) {this.maxSlots = maxSlots;}
    
    // --GETTERS--
    public Item getItem(int index) {
        return items.get(index);
    }

    public int getMaxSlots() {
        return maxSlots;
    }

    public int getCurrentSize() {
        return items.size();
    }

    public boolean isFull() {
        return items.size() >= maxSlots;
    }

    public boolean isCapableToAdd(int quantityToAdd){
        if(getCurrentSize()>(quantityToAdd + maxSlots)){
            return false;
        }
        return true;
    }

    // --PRINTS--
    public void printInventory() {
        System.out.println("Inventário (" + items.size() + "/" + maxSlots + "):");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("[" + i + "] " + items.get(i));
        }
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
}
