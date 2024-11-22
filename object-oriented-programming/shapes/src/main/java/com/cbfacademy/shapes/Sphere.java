package com.cbfacademy.shapes;

public class Sphere {

    private double radius;
    sphere(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
