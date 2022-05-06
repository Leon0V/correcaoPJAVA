package views;

import controllers.PayController;
import models.Employee;
import models.Payroll;
import utils.Console;
import controllers.EmployeeController;

public class SearchPay {
    
    public void list() {

        PayController payController = new PayController();
        EmployeeController employeeController = new EmployeeController();

        System.out.println("\n -- SEARCHING PAYROLLS -- \n");
        
        for(Payroll regPays : payController.list()){

            String docNumber = Console.readString("Inform the employee's document: ");
            Employee employee = employeeController.searchByDoc(docNumber);


            if(regPays.getDocument() != null && regPays.getDocument().equals(employee)){

                int month = Console.readInt("Inform the fiscal month: ");

                if(regPays.getMonth() != 0 && regPays.getMonth() == (month)){

                    int year = Console.readInt("Inform the fiscal year: ");

                    if(regPays.getYear() !=0 && regPays.getYear() == (year)){

                        System.out.println(regPays);
                        break;
                    }else{System.out.println("\n INVALID YEAR!! ");}

                }else{System.out.println("\n INVALID OR UNREGISTERED MONTH!! ");}

            }else{System.out.println("\n INVALID OR UNREGISTERED EMPLOYEE!! "); break;}

        }
    }
}
