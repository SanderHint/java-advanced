package org.sda.homework;

public class Shape {
    public static void main(String[] args) {

    }

    /**
     * Create a Shape class.
     * a) Add fields, create constructor, getters and setters.
     * b) Create classes Rectangle and Circle. Both of them should inherit class Shape.
     * Which fields and methods are common?
     */

   float area;
   float circumference;

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getCircumference() {
        return circumference;
    }

    public void setCircumference(float circumference) {
        this.circumference = circumference;
    }

}
