package models;

public class Taxes {

    private Employee document;
    private Payroll month;
    private Payroll year;
    private Payroll workhours;
    private Payroll value;
    private Double gross;
    private Double net;
    private Double incomeTax;
    private Double socialTax;
    private Double mortgage;


    public Employee getDocument() {
        return document;
    }
    public void setDocument(Employee document) {
        this.document = document;
    }
    public Payroll getMonth() {
        return month;
    }
    public void setMonth(Payroll month) {
        this.month = month;
    }
    public Payroll getYear() {
        return year;
    }
    public void setYear(Payroll year) {
        this.year = year;
    }
    public Payroll getWorkhours() {
        return workhours;
    }
    public void setWorkhours(Payroll workhours) {
        this.workhours = workhours;
    }
    public Payroll getValue() {
        return value;
    }
    public void setValue(Payroll value) {
        this.value = value;
    }
    public Double getGross() {
        return gross;
    }
    public void setGross(Double gross, Payroll value, Payroll workhours) {
        // this.gross = gross;
        this.gross = (Payroll.value * Payroll.workhours);
    }
    public Double getIncomeTax() {
        return incomeTax;
    }
    public void setIncomeTax(Double incomeTax) {
        if(gross < 1903.98){
            this.incomeTax = (gross * 0);
        }
        else if(gross >= 1903.99 && gross <= 2826.65){
            this.incomeTax = (gross * 0.075);
        }
        else if(gross >= 2826.66 && gross <= 3751.05){
            this.incomeTax = (gross * 0.15);
        }
        else if(gross >= 3751.52 && gross <= 4664.68){
            this.incomeTax = (gross * 0.225);
        }
        else {
            this.incomeTax = (gross * 0.275);
        }
    }
    public Double getSocialTax() {
        return socialTax;
    }
    public void setSocialTax(Double socialTax) {
        if(gross <= 1693.72){
            this.socialTax = (gross * 0.08);
        }
        else if(gross >= 1693.73 && gross <= 2822.90){
            this.socialTax = (gross * 0.09);
        }
        else if(gross >= 2822.91 && gross <= 5645.80){
            this.socialTax = (gross * 0.11);
        }
        else {
            this.socialTax = 621.03;
        }
    }
    public Double getMortgage() {
        return mortgage;
    }
    public void setMortgage(Double mortgage) {
        this.mortgage = (gross * 0.08);
    }
    public Double getLiquid() {
        return net;
    }
    public void setLiquid(Double liquid) {
        this.net = (gross - incomeTax - socialTax);
    }
    
    @Override
    public String toString() {
        return "Gross income: "+gross+" Income tax: "+incomeTax+" Social tax: "+socialTax+" Mortgage: "+mortgage+" Net income: "+net+" >>";
    }
}
