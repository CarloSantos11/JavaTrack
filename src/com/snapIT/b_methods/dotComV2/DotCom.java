package com.snapIT.b_methods.dotComV2;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;

//    int numOfHits = 0;
    void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public String checkYourself(String userInput) {
//        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

//        for (int cell : locationCells) {
//            if (guess == cell) {
//                result = "hit";
//                numOfHits++;
//                break;
//            }
//        }

        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Kill";
            } else {
                result = "hit";
            }
        }
//        if (numOfHits == locationCells.length) {
//            result = "kill";
//        }
//        System.out.println(result);
        return result;
    }

}







