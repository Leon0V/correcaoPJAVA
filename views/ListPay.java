package views;

import controllers.PayController;
import models.Payroll;

public class ListPay {
    
    public void list() {

        PayController payController = new PayController();

        System.out.println("\n -- LISTING ALL PAYMENT ROLLS -- \n");
        
        for(Payroll regPays : payController.list()){
            System.out.println(regPays+"\n");
        }
    }
}
