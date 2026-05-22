#include <string>//Logic-------->everything in inventory is hereditary to item
class Item
{
private:
    std::string name;
    std::string itemType;
    std::string descrition;
public:
    Item(/* args */);
    ~Item();
};

Item::Item(/* args */)
{
}

Item::~Item()
{
}
