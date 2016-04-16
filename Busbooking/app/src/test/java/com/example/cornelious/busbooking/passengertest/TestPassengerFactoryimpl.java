package com.example.cornelious.busbooking.passengertest;

import com.example.cornelious.busbooking.Interfaces.IPassengerFactory;
import com.example.cornelious.busbooking.domain.passenger.Passenger;
import com.example.cornelious.busbooking.factories.passenger.PassengerFactoryImpl;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cornelious on 4/16/2016.
 */
public class TestPassengerFactoryimpl {
    private static IPassengerFactory objPassengerFactory;

    @Before
    public void setUp() throws Exception {
        objPassengerFactory= new PassengerFactoryImpl().getInstance();

    }

    @Test
    public void testPassengerCreation() throws Exception {
        Passenger objPassenger=objPassengerFactory.createPassenger("123","Cornelious","Tarwireyi");
        Assert.assertEquals("123",objPassenger.getIdNumber());
        Assert.assertEquals("Cornelious",objPassenger.getName());
        Assert.assertEquals("Tarwireyi",objPassenger.getLastName());
    }

    @Test
    public void testPassengerUpdate() throws Exception {
        Passenger objPassenger=objPassengerFactory.createPassenger("123","Cornelious","Tarwireyi");
        Passenger objNewPassenger= new Passenger.PassengerBuilder()
                .copy(objPassenger)
                .id("321")
                .name("cj")
                .lastName("junior")
                .build();
        Assert.assertEquals(objNewPassenger.getIdNumber(),"321");
        Assert.assertEquals(objNewPassenger.getName(),"cj");
        Assert.assertEquals(objNewPassenger.getLastName(),"junior");


    }
}
