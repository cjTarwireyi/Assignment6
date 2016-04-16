package com.example.cornelious.busbooking.Interfaces;

import com.example.cornelious.busbooking.domain.passenger.Passenger;

/**
 * Created by Cornelious on 4/16/2016.
 */
public interface IPassengerFactory {
    Passenger createPassenger(String passengerId,String passengerName,String passengerSurname);
}
