#ifndef NPC_HPP
#define NPC_HPP
#include "inventory/Armor.hpp"
#include "inventory/Weapon.hpp"
#include <string>
class Npc
{
private:
    int hp, MaxHp, mp, MaxMp, atk;
    std::string status;//Insane, poison, cursed(demonic curse, n pode curar mas pode)
    //inteligence,luck, condition
    Armor *armor;
    Weapon *weapon;
public:
    Npc();
    ~Npc();

    //--GETTERS--

    int getHp() const;
    int getMaxHp() const;
    int getMp() const;
    int getMaxMp() const;
    int getAtk() const;
    std::string getStatus() const;
    Armor *getArmor() const;

    //--SETTERS--

    int setHp(int h);
    int setMaxHp(int mh);
    int setMp(int m);
    int setMaxMp(int mp);
    int setAtk(int a);


    //--EQUIP/UNEQUIP--

    std::string setStatus();
    Armor *unequipArmor();
    Armor *equipArmor();
};


#endif