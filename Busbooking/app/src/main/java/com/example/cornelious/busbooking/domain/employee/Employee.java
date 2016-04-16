package com.example.cornelious.busbooking.domain.employee;

/**
 * Created by Cornelious on 4/13/2016.
 */
public class Employee {
    private String empId;
    private String empName;
    private String empLastName;


   private Employee (EmployeeBuilder objEmployeeBuilder)
    {
        this.empId =objEmployeeBuilder.empId;
        this.empName=objEmployeeBuilder.empName;
        this.empLastName=objEmployeeBuilder.empLastName;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpLastName() {
        return empLastName;
    }
    public static class EmployeeBuilder
    {
        private String empId;
        private String empName;
        private String empLastName;

        public EmployeeBuilder id(String empId)
        {
            this.empId= empId;
           return this ;
        }
        public EmployeeBuilder Name(String empName)
        {
            this.empName=empName;
            return this;
        }
        public EmployeeBuilder lastName(String emplastName)
        {
            this.empLastName=emplastName;
            return this;
        }
        public EmployeeBuilder copy(Employee empValue)
        {
            this.empId=empValue.empId;
            this.empName=empValue.empName;
            this.empLastName=empValue.empLastName;
            return this;
        }

        public Employee build()
        {
            return new Employee(this);
        }

    }
}
