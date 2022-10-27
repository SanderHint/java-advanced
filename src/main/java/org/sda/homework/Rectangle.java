package org.sda.homework;

public class Rectangle extends Shape {

    private float perimeter;

    private float area;


//Constructor

    public Rectangle(int width, int height, float perimeter, float area) {
        super(width, height);
        this.perimeter = perimeter;
        this.area = area;
    }

    //Getter and Setter

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    //To-String

    @Override
    public String toString() {
        return "Rectangle{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}

