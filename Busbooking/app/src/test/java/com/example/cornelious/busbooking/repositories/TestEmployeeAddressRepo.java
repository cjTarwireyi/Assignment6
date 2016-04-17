package com.example.cornelious.busbooking.repositories;

import com.example.cornelious.busbooking.Interfaces.IAddressFactory;
import com.example.cornelious.busbooking.Interfaces.IEmployeeAddressRepository;
import com.example.cornelious.busbooking.domain.employee.EmpAddressVO;
import com.example.cornelious.busbooking.factories.employee.EmployeeAddressFactoryImpl;
import com.example.cornelious.busbooking.repositories.employee.EmpAddressRepoImpl;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cornelious on 4/17/2016.
 */
public class TestEmployeeAddressRepo {
    private IEmployeeAddressRepository objAddressRepo;
    private IAddressFactory objAddressFactory;


    @Before
    public void setUp() throws Exception {
        objAddressRepo = new EmpAddressRepoImpl();
        objAddressFactory = EmployeeAddressFactoryImpl.getInstance();

    }

    @Test
    public void testAdd() throws Exception {
        EmpAddressVO objAddress = objAddressFactory.createEmployeeAddress("79 oyster","Muizenberg","7945");
        EmpAddressVO addedAdderess= objAddressRepo.addAddress("1", objAddress);
        Assert.assertEquals(objAddress,addedAdderess);

    }

    @Test
    public void testFindAddress() throws Exception {
        EmpAddressVO objAddress = objAddressFactory.createEmployeeAddress("79 oyster","Muizenberg","7945");
        EmpAddressVO addedAdderess= objAddressRepo.addAddress("1", objAddress);
        EmpAddressVO found=objAddressRepo.findAddress("1");
        Assert.assertNotNull(found);
    }

    @Test
    public void testRemove() throws Exception {
        EmpAddressVO objAddress = objAddressFactory.createEmployeeAddress("79 oyster","Muizenberg","7945");
        EmpAddressVO addedAdderess= objAddressRepo.addAddress("1", objAddress);
        EmpAddressVO found=objAddressRepo.findAddress("1");
       //before removing
        Assert.assertNotNull(found);
        objAddressRepo.remove("1");
        //after removing
        EmpAddressVO foundAfterRemove=objAddressRepo.findAddress("1");
        Assert.assertNull(foundAfterRemove);


    }
}
