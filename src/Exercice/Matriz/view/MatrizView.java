package Exercice.Matriz.view;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizView {

    private final Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public MatrizView(Scanner scanner){
        this.scanner = scanner;
    }

    public int lerNumero(String message){
        imprimirMessage(message);
        return scanner.nextInt();
    }

    public Integer lerNumeroSeguro(String message){
        imprimirMessage(message);

        if(!scanner.hasNextInt()){
            scanner.next();
            return null;
        }

        return scanner.nextInt();
    }

    public void imprimirMessage(String message){
        System.out.print(message);
    }

    public void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public void imprimirDiagonal(int[] diagonal){
        System.out.println("Main diagonal: " + Arrays.toString(diagonal));
    }
}
