package com.snapIT.morningChallenges.weekThree;

import java.util.ArrayList;

public class Character {
    private String fName;
    private String lName;
    private String charClass;
    private ArrayList<String> skills;
    private ArrayList<String> inventory;

    public Character(String fName, String lName, String charClass, ArrayList<String> skills, ArrayList<String> inventory) {
        this.fName = fName;
        this.lName = lName;
        this.charClass = charClass;
        this.skills = skills;
        this.inventory = inventory;
    }

    public Character(String fName, String lName, String charClass) {
        this.fName = fName;
        this.lName = lName;
        this.charClass = charClass;
        this.skills = new ArrayList<String>();
        this.inventory = new ArrayList<String>();
    }

    public void learnNewSkill(String skill){
        skills.add(skill);
    }


    public void addToInventory(String item){
        inventory.add(item);
    }

    public void printInfo() {
        System.out.println(
                "Name: " + this.fName + " " + this.lName + "\n" +
                "Class: " + this.charClass + "\n" +
                "Skills: " + this.skills + "\n" +
                "Inventory: " + this.inventory + "\n"
        );
    }


}
