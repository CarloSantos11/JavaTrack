package com.snapIT.consoleGame;


// Name
// Height
// Weapons []
// Level
// Health
public class Character {
    private String name;
    private String height;
    private String[] weapons = {"Axe", "Assault Rifle", "Hand-hand"};
    private int level;
    private int health;
    private int magic;

    public Character(String name, String height, int level, int health, int magic ) {
        this.name = name;
        this.height = height;
        this.level = level;
        this.health = health;
        this.magic = magic;

    }

    public Character() {
        this.name = "name";
        this.height = "height";
        this.level = 1;
        this.health = 100;
        this.magic = 10;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String[] getWeapons() {
        return weapons;
    }

    public void setWeapons(String[] weapons) {
        this.weapons = weapons;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void attack() {
        int randomNumber = (int) (Math.random() * weapons.length);
        String weaponOfChoice =  this.weapons[randomNumber];
        System.out.println(this.name +  " is using "+ weaponOfChoice);
    }

    public void printInfo() {
        System.out.println(
                "name: " + name + "\n" +
                "height: " + height
        );
    }
}
