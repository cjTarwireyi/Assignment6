package com.example.cornelious.busbooking.repositories;

import com.example.cornelious.busbooking.Interfaces.IEmployeeFactory;
import com.example.cornelious.busbooking.Interfaces.IEmployeeRepository;
import com.example.cornelious.busbooking.domain.employee.Employee;
import com.example.cornelious.busbooking.factories.employee.EmployeeFactoryImpl;
import com.example.cornelious.busbooking.repositories.employee.EmployeeRepoImplimentation;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cornelious on 4/16/2016.
 */
public class TestEmployeeRepo {
    private IEmployeeRepository objEmpRepo;
    private IEmployeeFactory objEmplFactory;


    @Before
    public void setUp() throws Exception {
        objEmpRepo = new EmployeeRepoImplimentation();
        objEmplFactory= new EmployeeFactoryImpl();
    }

    @Test
    public void testAddEmployee() throws Exception {
        Employee objEmployee =objEmplFactory.createEmployee("123","Cornelious","Tarwireyi");
        String id =objEmpRepo.addEmployee(objEmployee);
        Assert.assertEquals("123",id);


    }

    @Test
    public void testFindByID() throws Exception {
        Employee objEmployee =objEmplFactory.createEmployee("123","Cornelious","Tarwireyi");
        Employee objFoundEmployee=objEmpRepo.finfBYId("123");
        Assert.assertSame("123",objFoundEmployee.getEmpId());

    }

    @Test
    public void testRemoveEmployee() throws Exception {
        Employee objEmployee =objEmplFactory.createEmployee("123", "Cornelious", "Tarwireyi");
        objEmpRepo.remove("123");
        Employee objFoundEmployee=objEmpRepo.finfBYId("123");
        Assert.assertEquals(null, objFoundEmployee);


    }
}
