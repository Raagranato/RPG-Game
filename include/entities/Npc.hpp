#define NPC_HPP
#ifndef NPC_HPP
#include "inventory/Armor.hpp"

class Npc
{
private:
    int hp;
    Armor *armor;
public:
    Npc();
    ~Npc();
};

Npc();

#endif