#ifndef NPC_HPP
#define NPC_HPP
#include "inventory/equippable/Armor.hpp"
#include "inventory/equippable/Weapon.hpp"
#include <string>
class Npc
{
private:
    int hp, maxHp, mp, maxMp, atk;
    std::string status;//Insane, poison, cursed(demonic curse, n pode curar mas pode)
    //inteligence,luck, condition
    Armor *equipedArmor;
    Weapon *equipedWeapon;
public:
    Npc(int hp, int maxHp, int mp, int maxMp, int atk, std::string status = "Good", Armor *equipedArmor = nullptr, Weapon *equipedWeapon = nullptr);//Declaration with nullptr- TODO
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

    void setHp(int hp);
    void setMaxHp(int maxHp);
    void setMp(int mp);
    void setMaxMp(int maxMp);
    void setAtk(int atk);

    //--PRINTS--
    void printHp() const;
    void printMaxHp() const;
    void printMp() const;
    void printMaxMp() const;
    void printAtk() const;
    void printStatus() const;
    void printArmor() const;

    //--EQUIP/UNEQUIP--

    std::string setStatus();
    Armor *unequipArmor();
    //Armor *equipArmor(Armor *armor);
};

#endif