package com.example.cornelious.busbooking.Interfaces;

import com.example.cornelious.busbooking.domain.bus.Maintainance;

/**
 * Created by Cornelious on 4/17/2016.
 */
public interface IBusMaintainanceFactory {
    Maintainance createMaintainance(String maintainanceCode,String descrition ,double cost);

}
