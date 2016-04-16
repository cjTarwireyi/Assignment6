package com.example.cornelious.busbooking.Interfaces;

import com.example.cornelious.busbooking.domain.employee.Employee;

/**
 * Created by Cornelious on 4/13/2016.
 */
public interface IEmployeeRepository {
    Employee finfBYId(String employeeId);
    String addEmployee(Employee objEmployee);
    void remove(Employee objEmployee);
}
