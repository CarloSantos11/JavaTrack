package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.arrays;


public class FiveBySixArray {
    public static void main(String[] args) {
        String [][] multiDimenisonCharacterArray = new String[5][6];

        int numToPrint = 1;

        for(int i = 0; i <5; i++){
            for (int j = 0; j < 6; j++){
                multiDimenisonCharacterArray[i][j] = Integer.toString(numToPrint);
            }
            numToPrint++;
        }

        for(int i = 0; i <5; i++){
            for (int j = 0; j < 6; j++){
                System.out.print(multiDimenisonCharacterArray[i][j]);
            }
            System.out.println();
        }
    }


}

// Print this out using a multidimensional array

//aaaaaa
//bbbbbb
//cccccc
//dddddd
//eeeeee