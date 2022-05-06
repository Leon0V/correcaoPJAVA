package controllers;

import java.util.ArrayList;

import models.Employee;

public class EmployeeController {

    private static ArrayList<Employee> employees = new ArrayList<Employee>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public ArrayList<Employee> list(){
        return employees;
    }

    public Employee searchByDoc(String doc){
        for (Employee registeredEmployee : employees){
            if(registeredEmployee.getDoc().equals(doc)){
                return registeredEmployee;
            }
        }
        return null;
    }
}
