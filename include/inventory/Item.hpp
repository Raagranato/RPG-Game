#include <string>//Logic-------->everything in inventory is hereditary to item - TODO
class Item
{
private:
    std::string name;
    std::string itemType;
    std::string descrition;
public:
    Item(std::string name,std::string itemType,std::string descrition);
    ~Item();
    
};