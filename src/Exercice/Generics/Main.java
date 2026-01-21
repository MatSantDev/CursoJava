package Exercice.Generics;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + ": ");
            int num = sc.nextInt(); sc.nextLine();
            ps.addValue(num);
        }

        System.out.println(ps.first());
        ps.imprimir();
        System.out.println("=======");
        ps.imprimir2();

        sc.close();
    }
}
