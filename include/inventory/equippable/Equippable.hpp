#ifndef EQUPPABLE_HPP
#define EQUPPABLE_HPP
#include <string>
#include "inventory/Item.hpp"

class Equippable:public Item
{
private:
    
public:
    Equippable();
    ~Equippable();
    bool isEquipped();
};

#endif