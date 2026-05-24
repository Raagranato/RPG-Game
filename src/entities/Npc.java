package entities;

import inventory.equippable.Armor;
import inventory.equippable.Weapon;

public class Npc {

    // --ATRIBUTOS--
    private int hp, maxHp, mp, maxMp, atk;
    private String status;
    private Armor equippedArmor;
    private Weapon equippedWeapon;

    // --BUILDER--
    public static class Builder {
        private int hp     = 100;
        private int maxHp  = 100;
        private int mp     = 50;
        private int maxMp  = 50;
        private int atk    = 10;
        private String status        = "Good";
        private Armor equippedArmor  = null;
        private Weapon equippedWeapon = null;

        public Builder setHp(int hp)                    { this.hp = hp; this.maxHp = hp; return this; }
        public Builder setMp(int mp)                    { this.mp = mp; this.maxMp = mp; return this; }
        public Builder setAtk(int atk)                  { this.atk = atk; return this; }
        public Builder setStatus(String status)          { this.status = status; return this; }
        public Builder setArmor(Armor armor)             { this.equippedArmor = armor; return this; }
        public Builder setWeapon(Weapon weapon)          { this.equippedWeapon = weapon; return this; }

        public Npc build() { return new Npc(this); }
    }

    private Npc(Builder b) {
        this.hp             = b.hp;
        this.maxHp          = b.maxHp;
        this.mp             = b.mp;
        this.maxMp          = b.maxMp;
        this.atk            = b.atk;
        this.status         = b.status;
        this.equippedArmor  = b.equippedArmor;
        this.equippedWeapon = b.equippedWeapon;
    }

    // --GETTERS--
    public int getHp()           { return hp; }
    public int getMaxHp()        { return maxHp; }
    public int getMp()           { return mp; }
    public int getMaxMp()        { return maxMp; }
    public int getAtk()          { return atk; }
    public String getStatus()    { return status; }
    public Armor getArmor()      { return equippedArmor; }
    public Weapon getWeapon()    { return equippedWeapon; }

    // --SETTERS--
    public void setHp(int hp)           { this.hp = hp; }
    public void setMaxHp(int maxHp)     { this.maxHp = maxHp; }
    public void setMp(int mp)           { this.mp = mp; }
    public void setMaxMp(int maxMp)     { this.maxMp = maxMp; }
    public void setAtk(int atk)         { this.atk = atk; }
    public void setStatus(String status){ this.status = status; }

    // --EQUIP/UNEQUIP--
    public void equipArmor(Armor armor)   { this.equippedArmor = armor; }
    public void equipWeapon(Weapon weapon){ this.equippedWeapon = weapon; }
    public void unequipArmor()            { this.equippedArmor = null; }
    public void unequipWeapon()           { this.equippedWeapon = null; }

    // --PRINTS--
    public void printStats() {
        System.out.println("HP: "     + hp + "/" + maxHp);
        System.out.println("MP: "     + mp + "/" + maxMp);
        System.out.println("ATK: "    + atk);
        System.out.println("Status: " + status);
        System.out.println("Armor: "  + (equippedArmor  != null ? equippedArmor  : "None"));
        System.out.println("Weapon: " + (equippedWeapon != null ? equippedWeapon : "None"));
    }
}