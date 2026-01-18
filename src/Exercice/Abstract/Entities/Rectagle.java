package Exercice.Abstract.Entities;

import Exercice.Abstract.Entities.Enums.Color;

public class Rectagle extends Shape{

    public Double width;
    private Double height;

    public Rectagle() {
        super();
    }

    public Rectagle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public Double area() {
        return width * height;
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectagle{" +
                "height=" + height +
                ", width=" + width +
                "} " + super.toString();
    }
}
