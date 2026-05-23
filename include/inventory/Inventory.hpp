#include <vector>
#include "inventory/Item.hpp"
class Inventory
{
private:
    std::vector<Item> items;
    int maxSlots;
public:
    Inventory(/* args */);
    ~Inventory();
    void removeItem();
    void addItem();
};
