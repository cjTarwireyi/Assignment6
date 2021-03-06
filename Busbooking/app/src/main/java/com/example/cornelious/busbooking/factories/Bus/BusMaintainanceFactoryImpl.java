package com.example.cornelious.busbooking.factories.Bus;

import com.example.cornelious.busbooking.Interfaces.IBusMaintainanceFactory;
import com.example.cornelious.busbooking.domain.bus.Maintainance;

/**
 * Created by Cornelious on 4/17/2016.
 */
public class BusMaintainanceFactoryImpl implements IBusMaintainanceFactory {
private BusMaintainanceFactoryImpl objMaintainanceFactory=null;
    public BusMaintainanceFactoryImpl getInstance()
    {
        if (objMaintainanceFactory==null)
            objMaintainanceFactory=new BusMaintainanceFactoryImpl();
        return objMaintainanceFactory;
    }


    @Override
    public Maintainance createMaintainance(String maintainanceCode,String descrition, double cost) {
        Maintainance objMaintainance = new Maintainance.BuildMaintainance()
                .code(maintainanceCode)
                .Description(descrition)
                .cost(cost)
                .build();
        return objMaintainance;
    }
}
