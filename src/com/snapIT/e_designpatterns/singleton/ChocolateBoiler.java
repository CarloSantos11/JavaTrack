package com.snapIT.e_designpatterns.singleton;

public class ChocolateBoiler {
    private static ChocolateBoiler boilerInstance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getBoilerInstance() {
        if (boilerInstance == null) {
            boilerInstance = new ChocolateBoiler();
        }
        return boilerInstance;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with milk/chocolate mixture
        }else {
            System.out.println("Wait!");
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
