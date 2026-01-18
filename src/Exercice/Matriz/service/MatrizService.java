package Exercice.Matriz.service;

public class MatrizService{

    public int contarNegativos(int[][] matriz) {
        int count = 0;
        for (int[] linha : matriz) {
            for (int valor : linha) {
                if (valor < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int[] obterDiagonalPrincipal(int[][] matriz) {
        int[] diagonal = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            diagonal[i] = matriz[i][i];
        }
        return diagonal;
    }

    public int[][] criarMatriz(int n) {
        return new int[n][n];
    }
}
