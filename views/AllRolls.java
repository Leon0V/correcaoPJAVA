package views;

import controllers.PayController;
import models.Payroll;

public class AllRolls {

    public void list() {

        PayController payController = new PayController();

        System.out.println("\n -- LISTING ALL PAYROLLS -- \n");

        for(Payroll regPays : payController.list()){
            System.out.println(regPays);
        }
        
    }
    
}
