package com.snapIT.b_methods.dotComGame.headFirstVersion;

public class SimpleDotComTester {
    public static void main(String[] args) {
        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();

        com.snapIT.b_methods.dotComGame.headFirstVersion.SimpleDotCom theDotCom = new com.snapIT.b_methods.dotComGame.headFirstVersion.SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);

        int [] locations = { randomNum, randomNum + 1, randomNum + 2};

        theDotCom.setLocationCells(locations);
        Math.random();

        System.out.println(helper.getUserInput("Enter a number"));
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("Enter a number");

            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }

//            Calling two methods with the same name from different packages
//            com.snapIT.b_methods.dotComGame.inClassVersion.SimpleDotCom variable = new com.snapIT.b_methods.dotComGame.inClassVersion.SimpleDotCom();
//            com.snapIT.b_methods.dotComGame.headFirstVersion.SimpleDotCom vaiable2 = new com.snapIT.b_methods.dotComGame.headFirstVersion.SimpleDotCom()
        }
    }
}
