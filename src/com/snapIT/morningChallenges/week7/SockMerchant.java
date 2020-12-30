package com.snapIT.morningChallenges.week7;

import java.util.HashMap;
import java.util.Map;

//Alex works at a clothing store. There is a large pile of socks that must be paired by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
//
//        For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
//
//        Function Description
//
//        Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.
//
//        sockMerchant has the following parameter(s):
//
//        n: the number of socks in the pile
//        ar: the colors of each sock

// PSEUDO CODE
// iterate through the array
// find how many pairs of each color there are
//      map data structure will keep track of how many total of each color
//      we can than divide by two and see how many pairs are available
//      we can create an array with only the pair values
// sum app all the pairs for each color


public class SockMerchant {
    public static void main(String[] args) {
        int [] socks = {10, 20, 20, 10, 10, 30, 50, 10, 10, 10,10, 20};

        System.out.println(sockMerchant(socks.length,socks));
    }

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int sumPairs = 0;
        Map<Integer, Integer> sockKey = new HashMap<Integer, Integer>();

        for(int i = 0; i < ar.length; i++) {
            if(sockKey.containsKey(ar[i])) {
                sockKey.put(ar[i], sockKey.get(ar[i]) + 1);
            } else {
                sockKey.put(ar[i], 1);
            }
        }

        sockKey.forEach((k,v) ->  sockKey.put(k, sockKey.get(k)/2));

        for (int pairs :sockKey.values()) {
            sumPairs += pairs;
        }
        return sumPairs;
    }
}
