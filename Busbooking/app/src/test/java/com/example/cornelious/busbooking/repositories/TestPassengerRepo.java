package com.example.cornelious.busbooking.repositories;

import com.example.cornelious.busbooking.Interfaces.IPassengerFactory;
import com.example.cornelious.busbooking.Interfaces.IPassengerRepository;
import com.example.cornelious.busbooking.domain.passenger.Passenger;
import com.example.cornelious.busbooking.factories.passenger.PassengerFactoryImpl;
import com.example.cornelious.busbooking.repositories.passenger.PassengerRepositoryImpl;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cornelious on 4/17/2016.
 */
public class TestPassengerRepo {
    private IPassengerRepository objPassengerRepo;
    private IPassengerFactory objPassengerFactory;

    @Before
    public void setUp() throws Exception {
        objPassengerRepo= new PassengerRepositoryImpl();
        objPassengerFactory = new PassengerFactoryImpl().getInstance();
    }

    @Test
    public void testAddPassenger() throws Exception {
        Passenger objPassenger = objPassengerFactory.createPassenger("123","cj","Junior");
       String id= objPassengerRepo.addEmployee(objPassenger);
        Assert.assertNotSame("1",id);
    }

    @Test
    public void testFindById() throws Exception {
        Passenger objPassenger = objPassengerFactory.createPassenger("123","cj","Junior");
        objPassengerRepo.addEmployee(objPassenger);
        Passenger objFoundPassenger=objPassengerRepo.finfBYId("111");
        Assert.assertNull(objFoundPassenger);

    }

    @Test
    public void testRemovePassenger() throws Exception {
        Passenger objPassenger = objPassengerFactory.createPassenger("123", "cj", "Junior");
        objPassengerRepo.addEmployee(objPassenger);
        //testing before removing
        Passenger objFound = objPassengerRepo.finfBYId("123");
        Assert.assertNotNull(objFound);

        //testing after removing
        objPassengerRepo.remove("123");
        Passenger objFound2= objPassengerRepo.finfBYId("123");
        Assert.assertNull(objFound2);



    }
}
