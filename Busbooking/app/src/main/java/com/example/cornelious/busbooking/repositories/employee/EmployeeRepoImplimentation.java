package com.example.cornelious.busbooking.repositories.employee;

import com.example.cornelious.busbooking.domain.employee.Employee;
import com.example.cornelious.busbooking.Interfaces.IEmployeeRepository;

import java.util.HashMap;

/**
 * Created by Cornelious on 4/13/2016.
 */
public class EmployeeRepoImplimentation implements IEmployeeRepository {
    private Employee objSearchValues;
    //Map employeeMap = new HashMap();
    HashMap<String,Employee> employeeMap = new HashMap<String, Employee>();

    public Employee finfBYId(String employeeId) {
        objSearchValues=employeeMap.get(employeeId);


        if(objSearchValues!=null) {

            final Employee objEmployee = new Employee.EmployeeBuilder()
                    .id(employeeId)
                    .Name(objSearchValues.getEmpName())
                    .lastName(objSearchValues.getEmpLastName())
                    .build();

            return objEmployee;
        }
        else
        {
            return  null;
        }
    }

    @Override
    public String addEmployee(Employee objEmployee) {
        employeeMap.put(objEmployee.getEmpId(),objEmployee);
        return objEmployee.getEmpId();

    }

    @Override
    public void remove(Employee objEmployee) {
        employeeMap.remove(objEmployee.getEmpId());
    }
}
