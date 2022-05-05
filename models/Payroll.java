package models;

public class Payroll {
    
    private Employee name;
    private Employee document;
    private int month;
    private int year;
     static int workhours;
     static Double value;
    

    public Employee getName() {
        return name;
    }
    public void setName(Employee name) {
        this.name = name;
    }
    public Employee getDocument() {
        return document;
    }
    public void setDocument(Employee document) {
        this.document = document;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getWorkhours() {
        return workhours;
    }
    public void setWorkhours(int workhours) {
        Payroll.workhours = workhours;
    }
    public Double getValue() {
        return value;
    }
    public void setValue(Double value) {
        Payroll.value = value;
    }
    

    @Override
    public String toString() {

        // attempt 1
        
        // return document+" Registered month: "+month+" Fiscal year: "+year+
        // " Gross income: "+gross+" Income tax: "+incomeTax+" Social tax: "+socialTax+" Mortgage: "+mortgage+" Net income: "+net+ " >>";
        
        // attempt 2
        // return "" + document + "Registered month: "+payroll.getMonth()+" Fiscal year: "+payroll.getYear()+
        // " Gross income: "+gross+" Income tax: "+incomeTax+" Social tax: "+socialTax+" Mortgage: "+mortgage+" Net income: "+net+ " >>";

        return "" + document + "Registered month: "+month+" Registered year: "+year+"";
    }
}
