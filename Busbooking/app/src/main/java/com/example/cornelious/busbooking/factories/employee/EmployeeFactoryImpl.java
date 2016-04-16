package com.example.cornelious.busbooking.factories.employee;

import com.example.cornelious.busbooking.Interfaces.IEmployeeFactory;
import com.example.cornelious.busbooking.domain.employee.Employee;

/**
 * Created by Cornelious on 4/15/2016.
 */
public class EmployeeFactoryImpl implements IEmployeeFactory {
    private static EmployeeFactoryImpl objEmpFactory=null;
    //public      EmployeeFactoryImpl(){}
    public IEmployeeFactory getInstance()
    {
        if (objEmpFactory==null)
            objEmpFactory=new EmployeeFactoryImpl();
        return objEmpFactory;
    }

    @Override
    public Employee createEmployee(String empId, String empName, String empSurname) {
        Employee objEmployee = new Employee.EmployeeBuilder()
                .id(empId)
                .Name(empName)
                .lastName(empSurname)
                .build();
        return objEmployee;
    }
}
