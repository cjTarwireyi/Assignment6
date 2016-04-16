package com.example.cornelious.busbooking.factories.passenger;

import com.example.cornelious.busbooking.Interfaces.IPassengerFactory;
import com.example.cornelious.busbooking.domain.passenger.Passenger;

/**
 * Created by Cornelious on 4/16/2016.
 */
public class PassengerFactoryImpl implements IPassengerFactory {
   private static PassengerFactoryImpl objPassengerFactory=null;
    public IPassengerFactory getInstance()
    {
        if (objPassengerFactory==null)
            objPassengerFactory= new PassengerFactoryImpl();
        return objPassengerFactory;
    }
    @Override
    public Passenger createPassenger(String passengerId, String passengerName, String passengerSurname) {
        Passenger objPassenger=new Passenger.PassengerBuilder()
                .id(passengerId)
                .name(passengerName)
                .lastName(passengerSurname)
                .build();
        return objPassenger;
    }
}
