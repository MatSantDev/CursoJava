package Exercice.Generics2.Application;

import Exercice.Generics2.Service.CalculatorAreaService;
import Exercice.Generics2.Entities.Circle;
import Exercice.Generics2.Entities.Rectangle;
import Exercice.Generics2.Interfaces.Shape;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        Circle circle = new Circle(2.0);
        Rectangle rectangle = new Rectangle(3.0,10.0);
        myShapes.add(circle);
        myShapes.add(rectangle);

        System.out.println("Rectangle: " + rectangle.area());
        System.out.println("Circle: " + circle.area());
        System.out.println("Total: " + CalculatorAreaService.totalArea(myShapes));
        System.out.println("Maior: " + CalculatorAreaService.maiorArea(myShapes));
    }
}
