package entities;

import entities.entities.Color;

public class Rectangle extends Shape{


    private Double whidth;
    private Double height;

    public Rectangle(){super();}

    public Rectangle(Double whidth, Double height) {
        this.whidth = whidth;
        this.height = height;
    }

    public Rectangle(Color color, Double whidth, Double height) {
        super(color);
        this.whidth = whidth;
        this.height = height;
    }

    public Double getWhidth() {
        return whidth;
    }

    public void setWhidth(Double whidth) {
        this.whidth = whidth;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return whidth * height;
    }
}
