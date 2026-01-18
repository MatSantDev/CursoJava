package Exercice.List.Entities;

import java.util.List;

public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percetange){
        this.salary = salary + salary * percetange / 100;
    }

    public static Employee findEmployeeById(List<Employee> list, int id){
        for (Employee e : list){
            if(e.getId() == id){
                return e;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Id: " +id+ "\n"+
                "Name: "+name+ "\n"+
                "Salary: "+salary+ "\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
