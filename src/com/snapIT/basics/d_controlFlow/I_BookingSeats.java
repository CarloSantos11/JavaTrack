package com.snapIT.basics.d_controlFlow;

public class I_BookingSeats {
    public static void main(String[] args) {
        int seats = 4;      // Seats Available
        int req_ticket = 4; // Requested amount of seats

        // This is a basic conditional
        // With this conditional we check to see if we have enough seats
        // To fulfill the requeste amount of Seats
        if( (req_ticket <= seats) ) {
            System.out.println("This Booking can be accpeted");
        } else
            System.out.println("This booking is rejected");
    }
}
