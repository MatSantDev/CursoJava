package Exercice.Exception2.Application;

import Exercice.Exception2.Modal.Entities.Account;
import Exercice.Exception2.Modal.Exception.AccountException;

import java.rmi.AccessException;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);
            System.out.println("Enter account data ");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();
            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            Double withdraw = sc.nextDouble();
            sc.nextLine();
            account.withdraw(withdraw);

            System.out.print("New balance: " + account.getBalance());
        } catch (AccountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Digito invalido");
        } catch (RuntimeException e) {
            System.out.println("Unexpected error" + e);
        }
    }
}
