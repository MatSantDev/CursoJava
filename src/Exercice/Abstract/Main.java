package Exercice.Abstract;

import Exercice.Abstract.Entities.Circle;
import Exercice.Abstract.Entities.Rectagle;

import Exercice.Abstract.Entities.Shape;
import Exercice.Abstract.Entities.Enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (1 + i) + " data: ");
            System.out.println("Rectangle or Circle (r/c)? ");
            String escolha = sc.nextLine();
            System.out.println("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.nextLine());
            Shape shape = null;

            if (escolha.startsWith("r")) {
                System.out.println("Width: ");
                Double width = sc.nextDouble();
                sc.nextLine();
                System.out.println("Height: ");
                Double height = sc.nextDouble();
                sc.nextLine();
                shape = new Rectagle(color, width, height);
            }
            if (escolha.startsWith("c")) {
                System.out.println("Radius: ");
                Double radius = sc.nextDouble();
                sc.nextLine();
                shape = new Circle(color, radius);
            }

            shapes.add(shape);
        }
        System.out.println();
        System.out.println("SHAPE AREAS:");

        for (Shape shape : shapes) {
            System.out.println(String.format("%.4f", shape.area()));
        }

        sc.close();
    }
}
