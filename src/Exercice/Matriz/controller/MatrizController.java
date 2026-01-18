package Exercice.Matriz.controller;

import Exercice.Matriz.service.MatrizService;
import Exercice.Matriz.view.MatrizView;

public class MatrizController {

    private final MatrizView view;
    private final MatrizService service;

    public MatrizController(MatrizView view, MatrizService service) {
        this.view = view;
        this.service = service;
    }

    public void executar() {
        Integer n;
        do {
            n = view.lerNumeroSeguro("Qual valor de N (1 a 100): ");

            if(n == null){view.imprimirMessage("Entrada invalida. Digite apenas numeros.\n");continue;}
            if (n < 1) {view.imprimirMessage("Valor invalido. Digite um numero maior ou igual a 1.\n");continue;}
            if (n > 100) {view.imprimirMessage("Numero muito grande. Maximo permitido: 100.\n");}

        }while (n == null || n < 1 || n > 100);

        int[][] matriz = service.criarMatriz(n);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = view.lerNumero("Valor do Indice [" + i + "][" + j + "]: ");
            }
        }

        view.imprimirMatriz(matriz);
        view.imprimirDiagonal(service.obterDiagonalPrincipal(matriz));
        view.imprimirMessage("Negative Numbers: " + service.contarNegativos(matriz));
    }
}
