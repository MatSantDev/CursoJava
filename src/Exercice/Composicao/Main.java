package Exercice.Composicao;

import Exercice.Composicao.Entities.Department;
import Exercice.Composicao.Entities.Enums.WorkedLevel;
import Exercice.Composicao.Entities.HourContract;
import Exercice.Composicao.Entities.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Worker worker = new Worker();
        Department department = new Department();

        System.out.print("Enter department´s name: ");
        department.setName(scanner.nextLine());

        worker.setDepartment(department);
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        worker.setName(scanner.nextLine());
        System.out.print("Level: ");
        String level = scanner.nextLine().toUpperCase();
        worker.setLevel(WorkedLevel.valueOf(level));
        System.out.print("Base salary: ");
        worker.setBaseSalary(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("How many contract to this worker: ");
        Integer n = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        for (int i = 0; i < n; i++) {
            HourContract hourContract = new HourContract();
            System.out.println("Enter contract #"+i+" data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date data = sdf.parse(scanner.nextLine());
            hourContract.setDate(data);
            System.out.print("Value per hour: ");
            hourContract.setValuePerHour(scanner.nextDouble());
            System.out.print("Duration: ");
            hourContract.setHours(scanner.nextInt());
            scanner.nextLine();
            System.out.println();
            worker.addContract(hourContract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: "+ worker.getName());
        System.out.println("Department: "+worker.getDepartment().getName());

        System.out.println("Income for " + monthAndYear +": "+ String.format("%.2f",worker.income(year,month)) );

        scanner.close();
    }
}
