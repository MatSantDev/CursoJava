package Exercice.Interface2;

import Exercice.Interface2.Entities.Contract;
import Exercice.Interface2.Entities.Installment;
import Exercice.Interface2.Services.ContractService;
import Exercice.Interface2.Services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        Date data = sdf.parse(sc.nextLine());
        System.out.print("Valor do contrato: ");
        Double totalValue = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        Integer months = sc.nextInt();
        sc.nextLine();

        Contract contract = new Contract(number, data, totalValue);
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, months);

        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }
        sc.close();
    }

}
