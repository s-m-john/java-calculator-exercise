package com.cbfacademy.shapes;

public class Rectangle extends Shape {
    
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return length * width;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
    
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    @Override
    public String toString() {
        return "Rectangle with length " + length + " and width " + width;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return length == other.length && width == other.width;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Double.hashCode(length) + Double.hashCode(width);
    }
    
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle);
        System.out.println(rectangle.equals(new Rectangle(5, 10)));
        System.out.println(rectangle.equals(new Rectangle(10, 5)));
        System.out.println(rectangle.hashCode());
    }
    
}
