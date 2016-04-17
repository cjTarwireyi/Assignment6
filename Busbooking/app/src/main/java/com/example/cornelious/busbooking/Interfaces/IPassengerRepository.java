package com.example.cornelious.busbooking.Interfaces;

import com.example.cornelious.busbooking.domain.employee.Employee;
import com.example.cornelious.busbooking.domain.passenger.Passenger;

/**
 * Created by Cornelious on 4/17/2016.
 */
public interface IPassengerRepository {
    Passenger finfBYId(String PassengerId);
    String addEmployee(Passenger objPassenger);
    void remove(String key);
}
