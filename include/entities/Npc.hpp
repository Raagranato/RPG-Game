#ifndef NPC_HPP
#define NPC_HPP
#include "inventory/Armor.hpp"
#include <string>
class Npc
{
private:
    int hp, MaxHp, mp, MaxMp, atk;
    std::string status;//Insane, poison
    //inteligence,luck,condition
    Armor *armor;
public:
    Npc();
    ~Npc();
};

#endif