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
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HR app starting");

        Department d1 = new Department("Engineering");
        System.out.println(d1.toString());

        Employee emp1 = new Employee(1001, "Bob", 10800);
        Employee emp2 = new Employee(1002, "Bas", 35000);
        Employee emp3 = new Employee(1003, "Bill", 65000);
        Employee emp4 = new Employee(1003, "Bab", 15000);
        Employee emp5 = new Employee(1003, "Bot", 95000);

        d1.addOneEmployee(emp1);
        d1.addOneEmployee(emp2);
        d1.addOneEmployee(emp3);
        d1.addOneEmployee(emp4);
        d1.addOneEmployee(emp5);

        
        System.out.println("Employee with ID 1003: " + d1.getEmployeeByID(5).toString());

        for (Employee emp : d1.getEmployees()) {
            System.out.println(emp.toString());
        }

        System.out.println("Total salary of department: " + d1.getTotalSalary());
        System.out.println("Average salary of department: " + d1.getAverageSalary());
    }

}
