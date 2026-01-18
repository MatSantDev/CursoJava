package Exercice.Matriz;

import Exercice.Matriz.controller.MatrizController;
import Exercice.Matriz.service.MatrizService;
import Exercice.Matriz.view.MatrizView;
import java.util.Locale;
import java.util.Scanner;

public class MainFX{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        MatrizView matrizView = new MatrizView(scanner);
        MatrizService matrizService = new MatrizService();
        MatrizController matrizController = new MatrizController(matrizView,matrizService);
        matrizController.executar();
        scanner.close();
    }
}
