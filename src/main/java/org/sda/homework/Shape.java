package org.sda.homework;

public class Shape {
    public static void main(String[] args) {

    }

    /**
     * Create a Shape class.
     * a) Add fields, create constructor, getters and setters.
     * b) Create classes Rectangle and Circle. Both of them should inherit class Shape.
     * Which fields and methods are common? -------------------------------- KAs selleks peaks kasutama Enumit???
     */

    private int width;
    private int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
