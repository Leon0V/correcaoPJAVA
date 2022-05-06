package models;

public class Payroll {
    
    private Employee document;
    private int month;
    private int year;
    private int workhours;
    private double value;
    private double gross;
    private double net;
    private double incomeTax;
    private double socialTax;
    private double mortgage;
    // private String docN;

    public Employee getDocument() {
        return document;
    }
    public void setDocument(Employee document) {
        this.document = document;
    }
    // public String getDocN() {
    //     return docN;
    // }
    // public void setDocN(String document) {
    //     this.docN = document;
    // }
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
        this.workhours = workhours;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
    
    public double getGross() {
        this.gross = (value * workhours);
        return gross;
    }
  
    public Double getIncomeTax() {
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
        return incomeTax;
    }
 
    public double getSocialTax() {
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
        return socialTax;
    }
 
    public double getMortgage() {
        this.mortgage = (gross * 0.08);
        return mortgage;
    }

    public Double getLiquid() {
        this.net = (gross - incomeTax - socialTax);
        return net;
    }


    @Override
    public String toString() {

        return "\n||" + document + " || Fiscal month: "+month+" || Fiscal year: "+year+" || Work hours"+workhours + " || Value per Hour: "+value+
        "\n || Gross income: "+getGross()+" || Income tax: "+getIncomeTax()+" || Social tax: "+getSocialTax()+
        "|| Mortgage: "+getMortgage()+" || Net income: "+getLiquid() +" || ";

    }
    
}
