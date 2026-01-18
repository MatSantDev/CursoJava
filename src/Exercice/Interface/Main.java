package Exercice.Interface;

import Exercice.Interface.Entities.CarRental;
import Exercice.Interface.Entities.Vehicle;
import Exercice.Interface.Service.BrasilTaxService;
import Exercice.Interface.Service.RentalService;
import Exercice.Interface.Service.TaxService;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.println("Modelo do carro: ");
        String modelo = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);;

        CarRental carRental = new CarRental(start, finish, new Vehicle(modelo));

        System.out.println("Entre com o preço por hora: ");
        Double valuePerHour = sc.nextDouble();
        System.out.println("Entre com o preço por dia: ");
        Double valuePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(valuePerHour, valuePerDay, new BrasilTaxService());


        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: " + carRental.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + carRental.getInvoice().getTax());
        System.out.println("Pagamento Total: " + carRental.getInvoice().getTotalPayment());

        sc.close();
    }

}
