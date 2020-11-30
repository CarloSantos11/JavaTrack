package com.snapIT.morningChallenges.weekThree;

public class CharacterTest {
    public static void main(String[] args) {
        Character kurt = new Character("Kurt", "Vonnegut", "Author");

        kurt.learnNewSkill("Writing");
        kurt.learnNewSkill("Reading");
        kurt.learnNewSkill("Story Telling");

        kurt.addToInventory("Pen");
        kurt.addToInventory("Notebook");
        kurt.addToInventory("Coffee Mug");
        kurt.printInfo();
    }
}
