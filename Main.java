
import utils.Console;
import views.AllRolls;
import views.ListEmp;
import views.RegEmployee;
import views.RegPay;

public class Main {
    
    public static void main(String[] args) {

        int option = 0;

        do{

            System.out.println("\n -- PAYMENT ROLL -- \n");
            System.out.println("\n Select an Option: \n");
            System.out.println(" 1 -- Register employee -- ");
            System.out.println(" 2 -- Register payroll -- ");
            System.out.println(" 3 -- Search payroll -- ");
            System.out.println(" 4 -- List payrolls -- ");
            System.out.println(" 0 -- QUIT -- ");

            option = Console.readInt(" Pick an Option: ");

            switch(option){

                case 1:
                    RegEmployee regEmployee = new RegEmployee();
                    regEmployee.register();
                break;

                case 2:
                    RegPay regPay = new RegPay();
                    regPay.register();
                break;

                case 5:
                    ListEmp listEmp = new ListEmp();
                    listEmp.list();
                break;

                case 6:
                    AllRolls allRolls = new AllRolls();
                    allRolls.list();
                break;
                case 0: 
                    System.out.println("\n -- QUIT -- \n");
                break;
                
                default: 
                    System.out.println("\n ##INVALID OPTION## \n"); 
                break;

            }

        }

        while (option != 0);

    }
}