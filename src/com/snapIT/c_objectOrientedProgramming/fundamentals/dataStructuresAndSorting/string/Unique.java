package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.string;

public class Unique {
    public static void main(String[] args) {

        System.out.println(removeDups("aaaaaaa"));
    }

    public static String removeDups(String test) {
        String result = "";
//        if (test == null || test.isEmpty()){
//            return test;
//        }

        int arrayLimit = test.length();
        for(int i = 0; i < arrayLimit; i++){
            char c = test.charAt(i);
            boolean isDuplicate = false;

            for(int j = 0; j < result.length(); j++) {
                char d = result.charAt(j);
                if (d == c) {
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate == false){
                result +=  "" + c;
            }
        }

        return result;

    }
}
