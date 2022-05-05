package controllers;

import java.util.ArrayList;

import models.Payroll;

public class PayController {

    private static ArrayList<Payroll> payrolls = new ArrayList<Payroll>();

    public void addList(Payroll payroll){
        payrolls.add(payroll);
    }

    public ArrayList<Payroll> list(){
        return payrolls;
    }
    
}
