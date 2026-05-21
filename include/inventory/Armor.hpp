#ifndef ARMOR_HPP
#define ARMOR_HPP



class Armor
{
private:
    float defense;//0.8 protege de 80% do dano
public:
    Armor(/* args */);
    ~Armor();
};

Armor::Armor(/* args */)
{
}

Armor::~Armor()
{
}
class ArmorType//Tipo de protege mais contra um tipo de ataque-Slash, cut, magic, impact
{
private:
    /* data */
public:
    ArmorType(/* args */);
    ~ArmorType();
};

ArmorType::ArmorType(/* args */)
{
}

ArmorType::~ArmorType()
{
}
#endif