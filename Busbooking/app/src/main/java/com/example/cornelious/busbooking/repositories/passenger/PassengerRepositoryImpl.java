package com.example.cornelious.busbooking.repositories.passenger;

import com.example.cornelious.busbooking.Interfaces.IPassengerRepository;
import com.example.cornelious.busbooking.domain.employee.Employee;
import com.example.cornelious.busbooking.domain.passenger.Passenger;

import java.util.HashMap;

/**
 * Created by Cornelious on 4/17/2016.
 */
public class PassengerRepositoryImpl implements IPassengerRepository {
    private Passenger objSearchValues;

    HashMap<String,Passenger> passengerMap = new HashMap<String, Passenger>();

    public Passenger finfBYId(String passengerId) {
        objSearchValues=passengerMap.get(passengerId);


        if(objSearchValues!=null) {

            final Passenger objPassenger = new Passenger.PassengerBuilder()
                    .id(passengerId)
                    .name(objSearchValues.getName())
                    .lastName(objSearchValues.getLastName())
                    .build();

            return objPassenger;
        }
        else
        {
            return  null;
        }
    }

    @Override
    public String addEmployee(Passenger objPassenger) {
        passengerMap.put(objPassenger.getIdNumber(), objPassenger);
        return objPassenger.getIdNumber();

    }

    @Override
    public void remove(String key) {

        passengerMap.remove(key);

    }
}
