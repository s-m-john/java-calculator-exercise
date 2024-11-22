package com.cbfacademy.shapes;

public class Paint {
    private double coverage;

    Paint(double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shape shape) {
        return shape.getArea() / coverage;
    }
    
}
