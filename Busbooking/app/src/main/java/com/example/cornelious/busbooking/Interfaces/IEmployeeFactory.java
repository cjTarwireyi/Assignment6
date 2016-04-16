package com.example.cornelious.busbooking.Interfaces;

import com.example.cornelious.busbooking.domain.employee.Employee;

/**
 * Created by Cornelious on 4/14/2016.
 */
public interface IEmployeeFactory {
    Employee createEmployee(String empId,String name,String surname);

}
