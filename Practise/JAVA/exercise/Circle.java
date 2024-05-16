package com.codewithharry.shape;
public class Circle{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(){
        this.radius=radius;
    }
     public double calculateArea() {
        return Math.PI * radius * radius;
    }
}