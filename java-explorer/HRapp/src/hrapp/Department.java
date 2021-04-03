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
public class Department {

    private String name;
    private static final int MAX_EMPLOYEE_COUNT = 10;
    private Employee[] emps = new Employee[MAX_EMPLOYEE_COUNT];

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        Employee[] actualEmps = new Employee[countOfEmployees()];
        for(int i = 0; i < countOfEmployees(); i++){
            actualEmps[i] = emps[i];
        }
        return actualEmps;
    }

    public void setEmployees(Employee[] emps) {
        this.emps = emps;
    }

    public int countOfEmployees() {
        int count = 0;
        for (Employee emp : emps) {
            count = count + ((emp == null) ? 0 : 1);
        }
        return count; //this.emps.length;
    }

    public void addOneEmployee(Employee newEmp) {
        int oldEmpCount = countOfEmployees();
        if (oldEmpCount + 1 > MAX_EMPLOYEE_COUNT) {
            System.out.println("Already " + MAX_EMPLOYEE_COUNT + " employees in department " + getName() + "!");
        } else {
            Employee[] newEmps = new Employee[oldEmpCount + 1]; //create new array one size larger
            System.arraycopy(this.emps, 0, newEmps, 0, oldEmpCount); //place existing employees in new array
            newEmps[oldEmpCount] = newEmp; //add new emp to last pos of new array (oldEmpCount = last position in new array)
            this.emps = newEmps; //replace class array with new array
        }
    }

    public Employee getEmployeeByID(Integer ID) {
        Employee resEmp = new Employee(9999, "Not found", 0.0);
        for (Employee emp : this.emps) {
            if (ID.equals(emp.getID())) {
                resEmp = emp;
                break;
            }
        }
        return resEmp;
    }

    public double getTotalSalary() {
        if (countOfEmployees() == 0 ) return 0.0;
        
        double total = 0.0;
        for (Employee emp : emps) {
            total = total + emp.getSalary();
        }
        return total;
    }

    public double getAverageSalary() {
        return (countOfEmployees() == 0) ? 0 : getTotalSalary() / countOfEmployees();
    }

    @Override
    public String toString() {
        if (countOfEmployees() == 0) {
            return "Department name: " + getName() + ", no employees yet";
        } else {
            return "Department name: " + getName() + ", nr of employees: " + countOfEmployees();
        }
    }
}
