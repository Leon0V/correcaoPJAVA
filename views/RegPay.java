package views;

import controllers.EmployeeController;
import controllers.PayController;
import models.Employee;
import models.Payroll;
import utils.Console;

public class RegPay {
    
    public void register() {
        
        Payroll payroll = new Payroll();
        PayController payController = new PayController();
        EmployeeController employeeController = new EmployeeController();

        System.out.println("\n -- REGISTER PAYROLL -- \n");

        String docId = Console.readString("Inform the employee Document Number: ");
        Employee employee = employeeController.searchByDoc(docId);

        if(employee != null){

            payroll.setDocument(employee);

            int month = Console.readInt("Inform the registering fiscal month: ");
            
            if(month > 0 && month <= 12){

                payroll.setMonth(month);

                int year = Console.readInt("Inform the registering Fiscal year: ");

                if(year > 1900){

                    payroll.setYear(year);

                    int workhours = Console.readInt("Inform the amount of hours worked in the month: ");

                    if(workhours != 0){

                        payroll.setWorkhours(workhours);

                        double value = Console.readDouble("Inform the amount paid for hour: ");

                        if(value != 0){

                            payroll.setValue(value);
                            payController.addList(payroll);

                            System.out.println("\n -- PAYROLL REGISTERED -- \n");

                        }else{System.out.println("\n VALUE PER HOUR HAS TO BE HIGHER THAN ZERO! \n");}

                    }else{System.out.println("\n WORKED HOURS HAS TO BE HIGHER THAN ZERO! \n");}

                }else{System.out.println("\n INFORM A VALID FISCAL YEAR! \n");}

            }else{System.out.println("\n INFORM A FISCAL MONTH FROM 1 TO 12! \n");}

        }else{System.out.println("\n EMPLOYEE NOT FOUND! \n");}
    }
    
}
