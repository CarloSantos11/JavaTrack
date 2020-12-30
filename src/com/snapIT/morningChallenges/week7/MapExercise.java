package com.snapIT.morningChallenges.week7;

import java.util.Map;
import java.util.TreeMap;

/**
 * This class was created as an exercise to understand maps
 */
public class MapExercise {

    public static void main(String[] args) {
        Map<String, String> dreamVisitGoals = new TreeMap<>();

        dreamVisitGoals.put("Bora Bora", "1/10/21");
        dreamVisitGoals.put("Dubai", "1/11/21");
        dreamVisitGoals.put("Trinadad", "1/12/21");
        dreamVisitGoals.put("DR", "1/13/21");
        dreamVisitGoals.put("Jamaica", "1/14/21");
        dreamVisitGoals.put("Puerto Rico", "1/10/21");
        dreamVisitGoals.put("Bora Bora", "1/10/21");

        System.out.println(dreamVisitGoals.toString());
    }
}
