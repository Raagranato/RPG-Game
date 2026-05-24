#include "entities/Npc.hpp"
#include <cassert>
#include <iostream>
int main(){
    Npc npc (1, 43, 10, 200, 70, "Good",  nullptr, nullptr);
    assert(npc.getAtk()==70);
    assert(npc.getMaxHp()==43);
    assert(npc.getHp()==1);
    assert(npc.getMp()==10);
    assert(npc.getMaxMp()==200);
    assert(npc.getStatus()=="Good");
    npc.setMaxMp(40);
    npc.setMaxHp(40);
    npc.setHp(40);
    npc.setMp(40);
    npc.setAtk(40);
    //npc.setArmor(40);
    assert(npc.getAtk()==40);
    assert(npc.getMaxHp()==40);
    assert(npc.getHp()==40);
    assert(npc.getMp()==40);
    assert(npc.getMaxMp()==40);
    std::cout<<"Teste NPC[ok]";
}