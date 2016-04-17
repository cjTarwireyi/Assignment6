package com.example.cornelious.busbooking.Interfaces;

import com.example.cornelious.busbooking.domain.passenger.PassengerAddress;

/**
 * Created by Cornelious on 4/17/2016.
 */
public interface IPassengerAddressRepo {
          PassengerAddress addAddress (String key,PassengerAddress objAddress);
        PassengerAddress findAddress(String key);
        PassengerAddress remove(String key);

}
