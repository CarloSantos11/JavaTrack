package com.snapIT.b_methods.dotComGame.inClassVersion;

public class A_SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

     String checkYourself(int stringGuess) {
//        int guess = Integer.parseInt(stringGuess);
        int guess = stringGuess;

        String result = "miss";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }

    void setLocationCells(int[] locs) {
        locationCells = locs;
    }
}
