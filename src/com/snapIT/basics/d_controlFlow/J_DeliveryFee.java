package com.snapIT.basics.d_controlFlow;

public class J_DeliveryFee {
    public static void main(String[] args) {
        int distance = 25;
        int fee = 0;

        // Based on a delivery service
        // Given a certain distance
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


        System.out.println("Delivery Fee: " + fee);
    }
}
