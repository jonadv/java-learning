/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrapp;

/**
 *
 * @author Jonathan
 */
public class Employee {
    private Integer ID;
    private String name;
    private double salary;

    public Employee(Integer ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return "Employee name: " + getName() + ", ID: "+ getID() + ", salary: " + getSalary();
    }
    
}
