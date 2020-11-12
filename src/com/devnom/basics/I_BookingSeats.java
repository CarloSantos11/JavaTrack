package com.devnom.basics;

public class I_BookingSeats {
    public static void main(String[] args) {
        int seats = 4;
        int req_ticket = 4;

        if( (req_ticket <= seats) ) {
            System.out.println("This Booking can be accpeted");
        } else
            System.out.println("This booking is rejected");
    }
}
