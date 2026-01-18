package Exercice.List.Main;

import Exercice.List.Entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("Emplyoee #" + (i + 1) + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt(); sc.nextLine();

            if(Employee.findEmployeeById(employees, id) != null){
                System.out.println("Id already exists. Try again.");
                i--;
                continue;
            }

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble(); sc.nextLine();

            employees.add(new Employee(id, name, salary));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();

        Employee employee = Employee.findEmployeeById(employees, id);
        if(employee == null){
            System.out.println("Id não existe");
            return;
        }

        System.out.print("Enter the percentage: ");
        Double percentage = sc.nextDouble();
        if (percentage <= 0) {
            System.out.println("Percentage must be positive.");
            return;
        }
        employee.increaseSalary(percentage);

        System.out.println("\nList of Employees: ");
        for (Employee item : employees) {
            System.out.println(item.toString());
        }

        sc.close();
    }
}
