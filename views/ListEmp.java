package views;

import controllers.EmployeeController;
import models.Employee;

public class ListEmp {

    public void list() {

        EmployeeController employeeController = new EmployeeController();

        System.out.println("\n -- LISTING ALL EMPLOYEES -- \n");

        for (Employee listedEmployee : employeeController.list()){
            System.out.println(listedEmployee+"\n");
        }
        
    }
    
}
