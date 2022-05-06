package views;

import controllers.EmployeeController;
import models.Employee;
import utils.Console;

public class RegEmployee {

    public void register() {

        Employee employee = new Employee();
        EmployeeController employeeController = new EmployeeController();

        System.out.println("\n -- EMPLOYEE REGISTER -- \n");
        employee.setName(Console.readString(" -- Enter employee name: "));
        employee.setDoc(Console.readString(" -- Enter employee document number: "));        
        
        employeeController.addEmployee(employee);

        System.out.println(" -- The employee "+employee.getName()+" was registered under the document: "+employee.getDoc()+".");
    }
    
    
}
