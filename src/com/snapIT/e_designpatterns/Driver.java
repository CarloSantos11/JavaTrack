package com.snapIT.e_designpatterns;

import com.snapIT.e_designpatterns.singleton.ChocolateBoiler;

public class Driver {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getBoilerInstance();

        boiler.fill();
        boiler.boil();
        boiler.fill();
        boiler.drain();
    }

}
