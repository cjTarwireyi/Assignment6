package com.example.cornelious.busbooking;

import com.example.cornelious.busbooking.booking.TestBooking;
import com.example.cornelious.busbooking.busTest.TestBusFactory;
import com.example.cornelious.busbooking.employeetest.TestAddressFactory;
import com.example.cornelious.busbooking.employeetest.TestEmployeeFactory;
import com.example.cornelious.busbooking.passengertest.TestPassengerFactoryimpl;
import com.example.cornelious.busbooking.repositories.TestEmployeeRepo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Cornelious on 4/16/2016.
 */

    @RunWith(Suite.class)
    @Suite.SuiteClasses({
            TestBooking.class,
            TestBusFactory.class,
            TestBusFactory.class,
            TestAddressFactory.class,
            TestEmployeeFactory.class,
            TestAddressFactory.class,
            TestPassengerFactoryimpl.class,
            TestEmployeeRepo.class
    })
    public class AppSuitTest {
}
