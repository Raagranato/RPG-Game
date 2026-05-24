package inventory;

public abstract class Item {

    // --ATRIBUTOS--
    private String name;
    private String itemType;
    private String description;

    // --CONSTRUTOR--
    public Item(String name, String itemType, String description) {
        this.name        = name;
        this.itemType    = itemType;
        this.description = description;
    }

    // --GETTERS--
    public String getName()        { return name; }
    public String getItemType()    { return itemType; }
    public String getDescription() { return description; }

    // --SETTERS--
    public void setName(String name)              { this.name = name; }
    public void setItemType(String itemType)       { this.itemType = itemType; }
    public void setDescription(String description) { this.description = description; }

    // --PRINTS--
    @Override
    public String toString() {
        return "[" + itemType + "] " + name + " - " + description;
    }
}