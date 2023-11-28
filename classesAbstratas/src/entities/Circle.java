package entities;

import entities.enums.Color;

public class Circle extends Shape {
    private Double radius;

    public Circle() {
        super();
    }

    public Circle(Color color, Double radio) {
        super(color);
        this.radius = radio;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }

}
