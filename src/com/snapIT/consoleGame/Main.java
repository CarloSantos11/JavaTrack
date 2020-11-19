package com.snapIT.consoleGame;

// character
// civilian
// hero/good guy
// villain
// levels
// location


public class Main {
    public static void main(String[] args) {
        Character hero1 = new Character("Christina", "100", 10, 1000, 1000);

        hero1.printInfo();
        hero1.attack();
    }
}
