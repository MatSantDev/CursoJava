package Exercice.Poo;

import Exercice.Poo.Entities.Company;
import Exercice.Poo.Entities.Individual;
import Exercice.Poo.Entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();
        sc.nextLine();

        List<TaxPayer> taxPayers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #"+(1+i)+" data:");
            System.out.print("Individual or company (i/c)? ");
            String escolha = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            sc.nextLine();
            if(escolha.startsWith("i")){
                System.out.print("Health expenditures: ");
                Double healthExpenditure = sc.nextDouble();
                sc.nextLine();
                taxPayers.add(new Individual(name, anualIncome, healthExpenditure));
            }
            if (escolha.startsWith("c")){
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                sc.nextLine();
                taxPayers.add(new Company(name, anualIncome, employees));
            }
            System.out.println();
        }

        System.out.println("TAXES PAID:");
        Double total = 0.0;
        for (TaxPayer taxPayer : taxPayers){
            System.out.println(taxPayer.getName() + ": $ " + taxPayer.tax());
            total += taxPayer.tax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $"+ total);


        sc.close();
    }
}
