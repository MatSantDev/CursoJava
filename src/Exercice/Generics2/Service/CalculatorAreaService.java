package Exercice.Generics2.Service;

import Exercice.Generics2.Interfaces.Shape;

import java.util.List;

public class CalculatorAreaService {

    public static double totalArea(List<? extends Shape> list) {
        double totalArea = 0;
        for (Shape item : list) {
            totalArea += item.area();
        }
        return totalArea;
    }

    public static <T extends Shape> T maiorArea(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Lista vazia");
        }

        T maior = list.get(0);

        for (T item : list) {
            if (item.area() > maior.area()) {
                maior = item;
            }
        }

        return maior;
    }
}
