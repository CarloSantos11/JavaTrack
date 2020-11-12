package com.devnom.basics;

public class J_DeliveryFee {
    public static void main(String[] args) {
        int distance = 25;
        int fee = 0;

        if (distance == 0){
            fee = 0;
        } else if (distance > 0 && distance < 5) {
            fee = 2;
        } else if (distance >= 5 && distance < 15) {
            fee = 5;
        } else if (distance >= 15 && distance < 25) {
            fee = 10;
        } else if (distance >= 25 && distance < 50) {
            fee = 15;
        } else {
            fee = 20;
        }

//        switch (distance) {
//            case 0:
//            case 1:
//
//        }

        System.out.println("Delivery Fee: " + fee);
    }
}
