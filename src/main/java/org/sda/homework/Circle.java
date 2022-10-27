package org.sda.homework;

public class Circle extends Shape {

   private float radius;
   private float diameter;

   //Constructor
    public Circle(int width, int height, float radius, float diameter) {
        super(width, height);
        this.radius = radius;
        this.diameter = diameter;
    }


    //Getter and Setter
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    //To-String
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
