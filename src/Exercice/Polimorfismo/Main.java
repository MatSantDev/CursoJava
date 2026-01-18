package Exercice.Polimorfismo;

import Exercice.Polimorfismo.Entities.Employee;
import Exercice.Polimorfismo.Entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #"+(1+i)+" data: ");
            System.out.print("Outsourced (y/n)? ");
            String escolha = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();
            Employee employee;

            if(escolha.startsWith("y")){
                System.out.print("Additional charge: ");
                double additional = sc.nextDouble();
                sc.nextLine();
                employee = new OutsourceEmployee(name, hours, valuePerHour, additional);
            }else {
                employee = new Employee(name,hours,valuePerHour);
            }

            employees.add(employee);
            System.out.println();
        }

        System.out.println("PAYMENTS:");
        for (Employee employee : employees){
            System.out.println(employee.imprimir());
        }

        sc.close();
    }

}
