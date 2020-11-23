package com.snapIT.a_basics.d_controlFlow;

public class K_Switch {
    public static void main(String[] args) {
        int discount = 0;
        int age = 11;

        switch (age) {
            case 10:
                discount = 300;
                break; // the breaks are necessary in order to keep the
            case 20:   // rest of the cases from running
                discount = 200;
                break;
            case 30:
                discount = 100;
                break;
            default:
                discount =  50;
                break;
        }
        System.out.println(discount);
    }
}
