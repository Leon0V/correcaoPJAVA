package models;

public class Employee {

    private String name;
    private String document;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoc() {
        return document;
    }

    public void setDoc(String document) {
        this.document = document;
    }

    @Override
    public String toString() {
        
        return "Employee: << " + name + " || Document Number: " + document+" >> ";
    }

}
