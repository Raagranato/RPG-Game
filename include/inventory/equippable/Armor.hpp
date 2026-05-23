#ifndef ARMOR_HPP
#define ARMOR_HPP
#include <string>
class Armor
{
private:
    float defense;//0.8 protege de 80% do dano
    std::string typeDef;
public:
    Armor(/* args */);
    ~Armor();
    
};
#endif