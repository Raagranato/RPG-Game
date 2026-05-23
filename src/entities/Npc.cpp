#include "entities/Npc.hpp"
#include <string>
#include <iostream>
Npc::Npc(int hp, int maxHp, int mp, int maxMp, int atk, std::string status, Armor *equipedArmor, Weapon *equipedWeapon)
{
    this->hp = hp;
    this->maxHp = maxHp;
    this->mp = mp;
    this->maxMp = maxMp;
    this->atk = atk;
    this->status = status;
    this->equipedArmor  = equipedArmor;
    this->equipedWeapon = equipedWeapon;
}

Npc::~Npc(){}

//--GETTERS--
int Npc::getHp() const { return hp; }
int Npc::getMaxHp() const { return maxHp; }
int Npc::getMp() const { return mp; }
int Npc::getMaxMp() const { return maxMp; }
int Npc::getAtk() const { return atk; }
std::string Npc::getStatus() const { return status; }
Armor *Npc::getArmor() const {return equipedArmor;}
Armor *Npc::unequipArmor() { return nullptr; }

//--SETTERS--
void Npc::setHp(int hp) { this->hp = hp; }
void Npc::setMaxHp(int maxHp) { this->maxHp = maxHp; }
void Npc::setMp(int mp) { this->mp = mp; }
void Npc::setMaxMp(int maxMp) { this->maxMp = maxMp; }
void Npc::setAtk(int atk) { this->atk = atk; }

//--PRINTS--
    void Npc::printHp() const{ std::cout<<"hp: "<< hp;}
    void Npc::printMaxHp() const{ std::cout<<"maxHp: "<< maxHp;}
    void Npc::printMp() const{ std::cout<<"mp: "<< mp;}
    void Npc::printMaxMp() const{ std::cout << "maxMp: "<< maxMp;}
    void Npc::printAtk() const{ std::cout<<"atk: "<< atk;}
    void Npc::printStatus() const{ std::cout<<"status: "<< status;}
    void Npc::printArmor() const{ std::cout<<"armor: "<< equipedArmor;}

// Armor Npc::*equipArmor(Armor *armor){return NULL;}